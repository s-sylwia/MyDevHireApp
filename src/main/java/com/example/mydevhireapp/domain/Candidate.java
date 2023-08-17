package com.example.mydevhireapp.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Value;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;
    private String email;
    private Date birthDate;
    private String programmingLanguages;


    @ElementCollection
    private List<String> skills;


    public void addSkill(String skill) {
        skills.add(skill);
    }

    public void removeSkill(String skill) {
        skills.remove(skill);
    }

}