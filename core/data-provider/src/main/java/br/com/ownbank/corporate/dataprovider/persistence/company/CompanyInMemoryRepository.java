package br.com.ownbank.corporate.dataprovider.persistence.company;

import br.com.ownbank.corporate.domain.company.Company;
import br.com.ownbank.corporate.domain.company.CompanyRepository;

import java.util.ArrayList;
import java.util.List;

public class CompanyInMemoryRepository implements CompanyRepository {

    private final List<Company> companyList = new ArrayList<>();

    @Override
    public List<Company> getCompanies() {
        return companyList;
    }

    @Override
    public Company save(Company company) {
        this.companyList.add(company);
        return company;
    }

    @Override
    public Company getCompanyByDocumentNumber(String documentNumber) {
        for (Company company : this.companyList) {
            if(company.getDocumentNumber().equals(documentNumber)) {
                return company;
            }
        }
        return null;
    }
}
