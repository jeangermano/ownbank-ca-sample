package br.com.ownbank.corporate.domain.product;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Product {
    private Long id;
    private String description;
    private String externalIdCRM;
}
