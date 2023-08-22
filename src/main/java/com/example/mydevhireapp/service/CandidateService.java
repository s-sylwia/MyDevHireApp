package com.example.mydevhireapp.service;

import com.example.mydevhireapp.domain.Candidate;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@ComponentScan
public interface CandidateService {
    List<Candidate> getAllCandidates();
    Optional<Candidate> getCandidateById(Long id);
    Candidate createCandidate(Candidate candidate);
    void deleteCandidate(Long id);
    Candidate updateCandidate(Long id, Candidate candidate);
}