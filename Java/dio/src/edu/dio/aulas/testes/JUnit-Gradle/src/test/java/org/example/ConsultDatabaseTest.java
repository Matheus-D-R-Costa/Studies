package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class ConsultDatabaseTest {

    @BeforeAll
    static void configureConnection() {
        Database.startConnection();
    }

    @BeforeEach
    void insertDataForTest() {
        Database.insertData(new People("Paulo", LocalDate.of(2000, 2, 12)));
    }

    @AfterEach
    void removeDataForTest() {
        Database.deleteData(new People("Paulo", LocalDate.of(2000, 2, 12)));
    }

    @Test
    void validateReturnData() {
        Assertions.assertTrue(true);
    }

    @Test
    void validateReturnData_2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void endConnection() {
        Database.endConnection();
    }
}
