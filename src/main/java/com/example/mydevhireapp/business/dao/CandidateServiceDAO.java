package com.example.mydevhireapp.business.dao;

import com.example.mydevhireapp.domain.Candidate;

import java.util.List;
import java.util.Optional;

public interface CandidateServiceDAO {
    List<Candidate> getAllCandidates();
    Optional<Candidate> getCandidateById(Long id);
    Candidate createCandidate(Candidate candidate);
    void deleteCandidate(Long id);
    Candidate updateCandidate(Long id, Candidate candidate);

}
