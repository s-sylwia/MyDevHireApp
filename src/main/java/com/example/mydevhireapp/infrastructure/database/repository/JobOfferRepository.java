package com.example.mydevhireapp.infrastructure.database.repository;

import com.example.mydevhireapp.infrastructure.database.entity.JobOfferEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobOfferRepository extends JpaRepository<JobOfferEntity, Long> {
}
