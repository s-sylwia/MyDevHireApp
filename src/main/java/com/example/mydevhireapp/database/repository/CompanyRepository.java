package com.example.mydevhireapp.database.repository;

import com.example.mydevhireapp.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Long> {




}
