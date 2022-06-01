package org.example.utilities;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logs {
    private final Logger log;

    private void printSeparator() {
        log.info("------------------------------------------------------------------------------------------");
    }

    private void printNewLine() {
        log.info("");
    }

    public Logs() {
        log = LogManager.getLogger("EXCEL_MAP");
    }

    public void info(String message) {
        log.info(message);
    }

    public void warn(String message) {
        log.warn(message);
    }

    public void error(String message) {
        log.error(message);
    }

    public void debug(String message) {
        log.debug(message);
    }
}
