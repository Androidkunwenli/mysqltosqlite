package com.bril.test.controller;

import com.bril.test.entity.Person;
import com.bril.test.service.PersonService;
import com.bril.test.util.DBUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
class PersonController {
    @Autowired
    PersonService personService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<Person> getPersonList() {
        List<Person> personList = personService.getPersonList();
        DBUtil.setConnection();

        DBUtil.create("t_user", "com.bril.test.entity.Person");
        DBUtil.insert("t_user", personList);

        DBUtil.create("t_user_2", "com.bril.test.entity.Person");
        DBUtil.insert("t_user_2", personList);

        DBUtil.endConnection();
        return personService.getPersonList();
    }

}