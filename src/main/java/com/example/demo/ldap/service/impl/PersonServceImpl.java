package com.example.demo.ldap.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.ldap.entity.Person;
import com.example.demo.ldap.repository.PersonRepository;
import com.example.demo.ldap.service.IPersonService;

@Service
public class PersonServceImpl implements IPersonService {
    @Autowired
    private PersonRepository personRepository;

    @Override
    public List<Person> findAll() {
        Iterable<Person> iterable = personRepository.findAll();
        List<Person> dataRet = new ArrayList<>();
        iterable.forEach(x -> {
            dataRet.add(x);
        });
        return dataRet;
    }

    @Override
    public Person save(Person person) {
        personRepository.save(person);
        return person;
    }
}
