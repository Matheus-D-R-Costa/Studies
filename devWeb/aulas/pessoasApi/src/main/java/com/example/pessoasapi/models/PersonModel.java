package com.example.pessoasapi.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "persons")
public class PersonModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;
    private Long phoneNumber;

    @Column(nullable = true)
    private String Address;

    @Column(nullable = true)
    private Boolean status;

}
