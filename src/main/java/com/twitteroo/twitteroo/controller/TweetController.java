package com.twitteroo.twitteroo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twitteroo.twitteroo.dto.PersonDTO;
import com.twitteroo.twitteroo.dto.TweetDTO;
import com.twitteroo.twitteroo.service.TweetService;

@RestController
@RequestMapping("/tweets")

public class TweetController {

    @Autowired
    private TweetService service;
 

    @PostMapping
    public void create(@RequestBody TweetDTO req){
       
     service.create(req);
        
    }
    
}
