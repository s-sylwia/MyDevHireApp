package com.example.mydevhireapp.business.dao;

import com.example.mydevhireapp.domain.Company;
import com.example.mydevhireapp.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CompanyServiceDAOImpl implements CompanyServiceDAO {

    private final CompanyService companyService;

    @Autowired
    public CompanyServiceDAOImpl(CompanyService companyService) {
        this.companyService = companyService;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }

    @Override
    public Optional<Company> getCompanyById(Long id) {
        return companyService.getCompanyById(id);
    }

    @Override
    public Company createCompany(Company company) {
        return companyService.createCompany(company);
    }

    // Dodaj inne metody zgodnie z wymaganiami biznesowymi
}
