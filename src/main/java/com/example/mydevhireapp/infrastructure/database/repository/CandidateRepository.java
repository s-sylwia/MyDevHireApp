package com.example.mydevhireapp.infrastructure.database.repository;

import com.example.mydevhireapp.domain.Candidate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {


}