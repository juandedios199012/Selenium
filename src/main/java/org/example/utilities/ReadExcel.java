package org.example.utilities;

import com.poiji.bind.Poiji;
import org.example.models.CredentialsModel;
import org.example.models.ItemModel;

import java.io.File;
import java.util.List;

public class ReadExcel {
    private final String EXCEL_PATH = "src/test/resources/testData/dataExcel.xlsx";
    private final Logs log;

    public ReadExcel() {
        log = new Logs();
    }

    public List<CredentialsModel> readCredentialsFromExcel() {
        log.info("Reading credentials from excel");
        return Poiji.fromExcel(new File(EXCEL_PATH), CredentialsModel.class);
    }

    public List<ItemModel> readItemsFromExcel() {
        log.info("Reading items from excel");
        return Poiji.fromExcel(new File(EXCEL_PATH), ItemModel.class);
    }
}
