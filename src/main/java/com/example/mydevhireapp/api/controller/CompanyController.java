package com.example.mydevhireapp.api.controller;

import com.example.mydevhireapp.domain.Company;
import com.example.mydevhireapp.business.dao.CompanyServiceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/companies")
public class CompanyController {

    private CompanyServiceDAO companyServiceDAO;

    @Autowired
    public CompanyController(CompanyServiceDAO companyServiceDAO) {
        this.companyServiceDAO = companyServiceDAO;
    }

    @PostMapping
    public Company createCompany(@Valid @RequestBody Company company) {
        return companyServiceDAO.createCompany(company);
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable Long id) {
        return companyServiceDAO.getCompanyById(id)
                .orElseThrow(() -> new RuntimeException("Company not found with id: " + id));
    }
}
