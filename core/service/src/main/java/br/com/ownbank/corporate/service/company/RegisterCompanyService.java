package br.com.ownbank.corporate.service.company;

import br.com.ownbank.corporate.domain.company.Company;
import br.com.ownbank.corporate.domain.company.CompanyFactory;
import br.com.ownbank.corporate.domain.company.CompanyRepository;
import br.com.ownbank.corporate.domain.shared.ValidateDocument;
import br.com.ownbank.corporate.usecase.company.RegisterCompany;
import br.com.ownbank.corporate.usecase.company.form.RegisterCompanyForm;
import lombok.AllArgsConstructor;

import java.util.List;
import java.util.Objects;

@AllArgsConstructor
public class RegisterCompanyService implements RegisterCompany {

    CompanyRepository companyRepository;

    @Override
    public List<Company> listCompanies() {
        return companyRepository.getCompanies();
    }

    @Override
    public Company firstRegister(RegisterCompanyForm registerCompanyForm) {

        if(!ValidateDocument.companyDocumentIsValid(registerCompanyForm.getDocumentNumber())) {
            throw new IllegalArgumentException("O CNPJ da empresa não é valido");
        }

        var company = companyRepository.getCompanyByDocumentNumber(registerCompanyForm.getDocumentNumber());
        if(Objects.nonNull(company)) {
            throw new IllegalArgumentException("Já existe um cadastro para empresa informada no status: " + company.getStatus());
        }

        company = CompanyFactory.builder().firstRegister(
                registerCompanyForm.getCompanyName(),
                registerCompanyForm.getCompanyTradeName(),
                registerCompanyForm.getDocumentNumber()
        );

        return companyRepository.save(company);
    }
}
