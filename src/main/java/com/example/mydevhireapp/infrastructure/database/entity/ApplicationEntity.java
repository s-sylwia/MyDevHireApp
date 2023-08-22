package com.example.mydevhireapp.infrastructure.database.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "applications")
public class ApplicationEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "candidate_id")
    private CandidateEntity candidate;

    @ManyToOne
    @JoinColumn(name = "job_offer_id")
    private JobOfferEntity jobOffer;

    @Temporal(TemporalType.TIMESTAMP)
    private Date applicationDate;
}