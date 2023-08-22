package com.example.mydevhireapp.business.dao;

import com.example.mydevhireapp.domain.Company;

import java.util.List;
import java.util.Optional;

public interface CompanyServiceDAO {
    List<Company> getAllCompanies();
    Optional<Company> getCompanyById(Long id);
    Company createCompany(Company company);
    // Dodaj inne metody zgodnie z wymaganiami biznesowymi
}
