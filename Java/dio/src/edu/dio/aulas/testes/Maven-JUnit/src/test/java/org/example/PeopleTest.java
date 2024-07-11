package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PeopleTest {

    @Test
    void validateAge() {
        People people = new People("Talita", LocalDate.of(2007, 2, 5));
        Assertions.assertEquals(17, people.getAge());
    }
}
