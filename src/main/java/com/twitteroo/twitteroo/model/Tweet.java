package com.twitteroo.twitteroo.model;

import com.twitteroo.twitteroo.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Entity
@NoArgsConstructor
public class Tweet {

    public Tweet(TweetDTO data){
        this.avatar=data.avatar();
        this.id=data.id();
        this.text=data.text();
        this.username=data.username();

    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column( length = 20 , nullable = false)
    private String username;

    @Column( length = 5000 , nullable = false)
    private String avatar;

    @Column( length = 250 , nullable = false)
    private String text;

}
