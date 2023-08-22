package com.example.mydevhireapp.service;

import com.example.mydevhireapp.domain.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    List<Company> getAllCompanies();

    Optional<Company> getCompanyById(Long id);

    Company createCompany(Company company);
}
