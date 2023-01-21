package com.twitteroo.twitteroo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.twitteroo.twitteroo.dto.TweetDTO;
import com.twitteroo.twitteroo.model.Tweet;
import com.twitteroo.twitteroo.repository.TweetRepository;

@Service
public class TweetService {

    @Autowired
    private TweetRepository repository;

    public String create(@RequestBody TweetDTO req){

        repository.save(new Tweet(req));
        return "OK";
    }
    
}
