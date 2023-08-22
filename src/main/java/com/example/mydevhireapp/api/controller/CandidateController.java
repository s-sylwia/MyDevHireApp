package com.example.mydevhireapp.api.controller;

import com.example.mydevhireapp.domain.Candidate;
import com.example.mydevhireapp.domain.exception.NotFoundException;
import com.example.mydevhireapp.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/candidates")
public class CandidateController {

    private final CandidateService candidateService;

    @Autowired
    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }

    @PostMapping
    public Candidate createCandidate(@Valid @RequestBody Candidate candidate) {
        return candidateService.createCandidate(candidate);
    }

    @GetMapping("/{id}")
    public Candidate getCandidateById(@PathVariable Long id) {
        return candidateService.getCandidateById(id)
                .orElseThrow(() -> new NotFoundException("Candidate not found with id: " + id));
    }
}