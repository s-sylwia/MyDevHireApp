package com.example.mydevhireapp.business.dao;

import com.example.mydevhireapp.domain.Candidate;
import com.example.mydevhireapp.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CandidateServiceDAOImpl implements CandidateServiceDAO {

    private final CandidateService candidateService;

    @Autowired
    public CandidateServiceDAOImpl(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @Override
    public List<Candidate> getAllCandidates() {
        return candidateService.getAllCandidates();
    }

    @Override
    public Optional<Candidate> getCandidateById(Long id) {
        return candidateService.getCandidateById(id);
    }

    @Override
    public Candidate createCandidate(Candidate candidate) {
        return candidateService.createCandidate(candidate);
    }

    @Override
    public void deleteCandidate(Long id) {
        candidateService.deleteCandidate(id);
    }

    @Override
    public Candidate updateCandidate(Long id, Candidate candidate) {
        return candidateService.updateCandidate(id, candidate);
    }

}
