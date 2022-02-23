package br.com.ownbank.corporate.usecase.company.form;

import lombok.Data;

@Data
public class RegisterCompanyForm {
    private String documentNumber;
    private String companyName;
    private String companyTradeName;
}
