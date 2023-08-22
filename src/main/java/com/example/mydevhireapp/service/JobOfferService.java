package com.example.mydevhireapp.service;

import com.example.mydevhireapp.infrastructure.database.entity.JobOfferEntity;

import java.util.List;
import java.util.Optional;

public interface JobOfferService {
    JobOfferEntity createJobOffer(JobOfferEntity jobOffer);
    Optional<JobOfferEntity> getJobOfferById(Long id);
    List<JobOfferEntity> getAllJobOffers();
}
