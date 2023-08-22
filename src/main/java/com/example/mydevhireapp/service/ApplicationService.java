package com.example.mydevhireapp.service;

import com.example.mydevhireapp.domain.Candidate;
import com.example.mydevhireapp.domain.Company;
import com.example.mydevhireapp.infrastructure.database.entity.JobOfferEntity;

import java.util.List;
import java.util.Optional;

public interface ApplicationService {
    Candidate createCandidate(Candidate candidate);
    Optional<Candidate> getCandidateById(Long id);
    List<JobOfferEntity> getAllJobOffers();
    Company createCompany(Company company);
}
