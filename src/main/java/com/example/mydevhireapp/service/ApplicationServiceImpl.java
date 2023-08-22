package com.example.mydevhireapp.service;

import com.example.mydevhireapp.domain.Candidate;
import com.example.mydevhireapp.domain.Company;
import com.example.mydevhireapp.infrastructure.database.entity.JobOfferEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    private final CandidateService candidateService;
    private final JobOfferService jobOfferService;
    private final CompanyService companyService;

    @Autowired
    public ApplicationServiceImpl(
            CandidateService candidateService,
            JobOfferService jobOfferService,
            CompanyService companyService
    ) {
        this.candidateService = candidateService;
        this.jobOfferService = jobOfferService;
        this.companyService = companyService;
    }

    @Override
    public Candidate createCandidate(Candidate candidate) {
        return candidateService.createCandidate(candidate);
    }

    @Override
    public Optional<Candidate> getCandidateById(Long id) {
        return candidateService.getCandidateById(id);
    }

    @Override
    public List<JobOfferEntity> getAllJobOffers() {
        return jobOfferService.getAllJobOffers();
    }

    @Override
    public Company createCompany(Company company) {
        return companyService.createCompany(company);
    }

}
