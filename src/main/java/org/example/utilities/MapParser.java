package org.example.utilities;

import org.example.models.CredentialsModel;
import org.example.models.ItemModel;

import java.util.HashMap;

public class MapParser {
    private final Logs log;

    public MapParser() {
        log = new Logs();
    }

    public HashMap<String, CredentialsModel> getCredentialsMap() {
        var credentialsMap = new HashMap<String, CredentialsModel>();
        var credentialsList = new ReadExcel().readCredentialsFromExcel();

        log.info("For each of the credentials List");
        for (CredentialsModel credentials: credentialsList) {
            log.debug(credentials.getUsername());
            credentialsMap.put(credentials.getKey(), credentials);
        }
        log.info("Finishing for each");
        return credentialsMap;
    }

    public HashMap<String, ItemModel> getItemsMap() {
        var itemsMap = new HashMap<String, ItemModel>();
        var itemsList = new ReadExcel().readItemsFromExcel();

        log.info("For each of the item List");
        for (ItemModel item: itemsList) {
            log.debug(item.getItemName());
            itemsMap.put(item.getKey(), item);
        }
        log.info("Finishing for each");

        return itemsMap;
    }
}
