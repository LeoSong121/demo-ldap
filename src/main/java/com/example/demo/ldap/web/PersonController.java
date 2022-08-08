package com.example.demo.ldap.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.example.demo.ldap.entity.Person;
import com.example.demo.ldap.service.IPersonService;

@RestController
@RequestMapping(value = "/persons")
public class PersonController {
    @Autowired
    private IPersonService personService;

    @GetMapping(value = "/")
    public String findAll() {
        List<Person> lists = personService.findAll();
        return JSON.toJSONString(lists);
    }

    @PostMapping(value = "/")
    public String addOne() {
        Person person = new Person();
        person.setUid("uid:1");
        person.setUserName("AAA");
        person.setCommonName("aaa");
        person.setUserPassword("123456");
        personService.save(person);
        List<Person> lists = personService.findAll();
        return JSON.toJSONString(lists);
    }
}
