package org.example.utilities;

import org.example.models.CredentialsModel;

public class DataProviders {

    public CredentialsModel getJeffersonCredentials() {
        var mapParser = new MapParser();
        return mapParser.getCredentialsMap().get("jeff");
    }
}
