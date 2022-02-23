package br.com.ownbank.corporate.domain.company;

public class CompanyFactory {

    private final Company company;

    private CompanyFactory() {
        this.company = new Company();
    }

    public static CompanyFactory builder() {
        return new CompanyFactory();
    }

    public Company firstRegister(String name, String tradeName, String documentNumber) {
        this.company.setName(name);
        this.company.setTradeName(tradeName);
        this.company.setDocumentNumber(documentNumber);
        this.company.setStatus(CompanyStatus.PENDING);
        return company;
    }
}
