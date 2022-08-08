package com.example.demo.ldap.repository;

import javax.naming.Name;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.ldap.entity.Person;

public interface PersonRepository extends CrudRepository<Person, Name> {

}
