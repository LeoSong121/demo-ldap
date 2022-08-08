package com.example.demo.ldap.service;

import java.util.List;

import com.example.demo.ldap.entity.Person;

public interface IPersonService {
    
    List<Person> findAll();
    
    Person save(Person person);
}
