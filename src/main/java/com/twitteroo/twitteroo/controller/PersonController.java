package com.twitteroo.twitteroo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitteroo.twitteroo.dto.PersonDTO;
import com.twitteroo.twitteroo.model.Person;
import com.twitteroo.twitteroo.repository.PersonRepository;
import com.twitteroo.twitteroo.service.PersonService;

@RestController
@RequestMapping("/sign-up")
public class PersonController {

    @Autowired
    private PersonService service;
 

    @PostMapping
    public void create(@RequestBody PersonDTO req){
       
     service.create(req);
        
    }
    
}
