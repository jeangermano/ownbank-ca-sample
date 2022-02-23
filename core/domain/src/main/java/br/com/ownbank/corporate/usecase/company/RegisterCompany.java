package br.com.ownbank.corporate.usecase.company;

import br.com.ownbank.corporate.domain.company.Company;
import br.com.ownbank.corporate.usecase.company.form.RegisterCompanyForm;

import java.util.List;

public interface RegisterCompany {

    List<Company> listCompanies();

    Company firstRegister(RegisterCompanyForm registerCompanyForm);
}
