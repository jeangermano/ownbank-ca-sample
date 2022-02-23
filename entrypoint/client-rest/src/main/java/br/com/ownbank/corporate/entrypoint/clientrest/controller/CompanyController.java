package br.com.ownbank.corporate.entrypoint.clientrest.controller;

import br.com.ownbank.corporate.domain.company.Company;
import br.com.ownbank.corporate.usecase.company.RegisterCompany;
import br.com.ownbank.corporate.usecase.company.form.RegisterCompanyForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/services/company")
public class CompanyController {

    @Autowired
    RegisterCompany registerCompany;

    @GetMapping
    public ResponseEntity<List<Company>> getAllCompanies(){
        var companies = registerCompany.listCompanies();
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(companies);
    }

    @PostMapping
    public ResponseEntity<Company> firstRegister(@RequestBody RegisterCompanyForm registerCompanyForm){
        var company = registerCompany.firstRegister(registerCompanyForm);
        return ResponseEntity
                .ok()
                .contentType(MediaType.APPLICATION_JSON)
                .body(company);
    }
}

