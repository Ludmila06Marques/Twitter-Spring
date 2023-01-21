package com.twitteroo.twitteroo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.twitteroo.twitteroo.dto.PersonDTO;
import com.twitteroo.twitteroo.model.Person;
import com.twitteroo.twitteroo.repository.PersonRepository;

@Service
public class PersonService {

    @Autowired
    private PersonRepository  repository;

    public String create(@RequestBody PersonDTO req){
        repository.save(new Person(req));
        return "OK";
    }
}
