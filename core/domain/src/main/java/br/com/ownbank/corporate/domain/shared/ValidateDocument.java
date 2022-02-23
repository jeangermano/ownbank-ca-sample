package br.com.ownbank.corporate.domain.shared;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ValidateDocument {

    public static boolean companyDocumentIsValid(String documentNumber) {
        return true;
    }
}
