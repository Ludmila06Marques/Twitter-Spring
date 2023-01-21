package com.twitteroo.twitteroo.model;

import com.twitteroo.twitteroo.dto.PersonDTO;

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

public class Person {

    public Person( PersonDTO data){
        this.id=data.id();
        this.avatar=data.avatar();
        this.name=data.name();
    }


     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column( length = 20 , nullable = false)
    private String name;

    @Column( length = 5000 , nullable = false)
    private String avatar;
}
