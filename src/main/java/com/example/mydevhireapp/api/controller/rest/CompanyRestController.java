package com.example.mydevhireapp.api.controller.rest;

        import com.example.mydevhireapp.domain.Company;
        import com.example.mydevhireapp.domain.exception.NotFoundException;
        import com.example.mydevhireapp.service.CompanyService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.web.bind.annotation.*;

        import javax.validation.Valid;
        import java.util.List;

@RestController
@RequestMapping("/api/companies") // Ścieżka dostępu do kontrolera firm
public class CompanyRestController {

    private final CompanyService companyService;

    @Autowired
    public CompanyRestController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @PostMapping
    public Company createCompany(@Valid @RequestBody Company company) {
        return companyService.createCompany(company);
    }

    @GetMapping("/{id}")
    public Company getCompanyById(@PathVariable Long id) {
        return companyService.getCompanyById(id)
                .orElseThrow(() -> new NotFoundException("Company not found with id: " + id));
    }

    @GetMapping // + pozostałe endpointy do dodania
    public List<Company> getAllCompanies() {
        return companyService.getAllCompanies();
    }
}
