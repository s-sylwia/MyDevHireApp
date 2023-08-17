package com.example.mydevhireapp.domain;

import javax.persistence.*;

@Entity
public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String industry;
    private String location;
    private String contactEmail;

    // Getters, setters, constructors...
}