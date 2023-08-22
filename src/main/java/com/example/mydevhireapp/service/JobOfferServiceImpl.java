package com.example.mydevhireapp.service;

import com.example.mydevhireapp.infrastructure.database.entity.JobOfferEntity;
import com.example.mydevhireapp.infrastructure.database.repository.JobOfferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JobOfferServiceImpl implements JobOfferService {

    private final JobOfferRepository jobOfferRepository;

    @Autowired
    public JobOfferServiceImpl(JobOfferRepository jobOfferRepository) {
        this.jobOfferRepository = jobOfferRepository;
    }

    @Override
    public JobOfferEntity createJobOffer(JobOfferEntity jobOffer) {
        return jobOfferRepository.save(jobOffer);
    }

    @Override
    public Optional<JobOfferEntity> getJobOfferById(Long id) {
        return jobOfferRepository.findById(id);
    }

    @Override
    public List<JobOfferEntity> getAllJobOffers() {
        return jobOfferRepository.findAll();
    }
}
