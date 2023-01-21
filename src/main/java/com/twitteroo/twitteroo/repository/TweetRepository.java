package com.twitteroo.twitteroo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitteroo.twitteroo.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet , Long>{
    
}
