package com.bril.test.service.impl;

import com.bril.test.dao.PersonDao;
import com.bril.test.entity.Person;
import com.bril.test.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    PersonDao personDao;

    @Override
    public List<Person> getPersonList() {
        return personDao.getPersonList();
    }
}