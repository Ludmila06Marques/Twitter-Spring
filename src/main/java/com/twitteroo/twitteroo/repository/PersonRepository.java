package com.twitteroo.twitteroo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twitteroo.twitteroo.model.Person;

public interface PersonRepository extends JpaRepository<Person , Long> {
    
}
