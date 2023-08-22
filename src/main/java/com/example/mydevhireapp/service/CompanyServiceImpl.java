package com.example.mydevhireapp.service;

import com.example.mydevhireapp.domain.Company;
import com.example.mydevhireapp.infrastructure.database.repository.CompanyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CompanyServiceImpl implements CompanyService {

    private final CompanyRepository companyRepository;

    @Autowired
    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    @Override
    public List<Company> getAllCompanies() {
        return null;
    }

    @Override
    public Optional<Company> getCompanyById(Long id) {
        return Optional.empty();
    }

    @Override
    public Company createCompany(Company company) {
        return null;
    }
}
