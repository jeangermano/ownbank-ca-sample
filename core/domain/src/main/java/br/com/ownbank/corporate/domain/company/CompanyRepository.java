package br.com.ownbank.corporate.domain.company;

import java.util.List;

public interface CompanyRepository {
    List<Company> getCompanies();
    Company save(Company company);
    Company getCompanyByDocumentNumber(String documentNumber);
}
