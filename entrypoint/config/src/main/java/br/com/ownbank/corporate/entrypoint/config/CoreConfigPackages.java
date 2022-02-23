package br.com.ownbank.corporate.entrypoint.config;

import org.apache.commons.lang3.ArrayUtils;

public class CoreConfigPackages {

    private static final String[] servicesPackagesToScan = {
            "br.com.ownbank.corporate.service.company"
    };

    private static final String[] persistencePackagesToScan = {
            "br.com.ownbank.corporate.dataprovider.persistence.company"
    };

    public static String[] componentPackagesToScan() {
        return ArrayUtils.addAll(persistencePackagesToScan, servicesPackagesToScan);
    }

}
