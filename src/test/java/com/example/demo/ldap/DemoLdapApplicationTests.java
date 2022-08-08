package com.example.demo.ldap;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.ldap.entity.Person;
import com.example.demo.ldap.repository.PersonRepository;
import com.example.demo.ldap.service.IPersonService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
class DemoLdapApplicationTests {
    @Autowired
    private PersonRepository personRepository;
    
    @Autowired
    private IPersonService personService;

    @Test
    void contextLoads() {
        Person person = new Person();
        person.setUid("uid:1");
        person.setUserName("AAA");
        person.setCommonName("aaa");
        person.setUserPassword("123456");
        personService.save(person);
        
        log.info("++++ LDAP test start +++");
        personRepository.findAll().forEach(p -> {
            System.out.println(p);
        });
        log.info("++++ LDAP test end +++");
        
        
    }

}
