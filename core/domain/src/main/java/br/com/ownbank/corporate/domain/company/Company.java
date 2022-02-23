package br.com.ownbank.corporate.domain.company;

import br.com.ownbank.corporate.domain.product.Product;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class Company {

    private String name;
    private String tradeName;
    private String documentNumber;
    private CompanyStatus status;
    private List<Product> products;
}
