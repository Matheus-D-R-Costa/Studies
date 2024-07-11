package org.example;

import java.util.logging.Logger;

public class Database {

    private static final Logger LOGGER = Logger.getLogger(Database.class.getName());

    public static void startConnection() {
        // fez algo
        LOGGER.info("Start Connection");
    }

    public static void endConnection() {
        // fez algo
        LOGGER.info("End Connection");
    }

    public static void insertData(People people) {
        // insere people no DB
        LOGGER.info("data inserted");
    }

    public static void deleteData(People people) {
        //remove people no DB
        LOGGER.info("data removed");
    }
}
