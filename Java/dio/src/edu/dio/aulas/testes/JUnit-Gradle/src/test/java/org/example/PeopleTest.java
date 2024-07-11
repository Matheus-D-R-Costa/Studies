package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class PeopleTest {

    @Test
    void validateAge() {
        People people = new People("Julia", LocalDate.of(2004, 2, 5));
        Assertions.assertEquals(20, people.getAge());
    }

    @Test
    void validateMajority() {
        People people = new People("John", LocalDate.of(2005, 3, 24));
        Assertions.assertTrue(people.isMajorAge());
    }

    @Test
    void validateArraysReleases() {
        int[] release_01 = {23, 3245, 46, 34, 667, 234, 2, -5234};
        int[] release_02 = {23, 3245, 46, 34, 667, 234, 2, -5234};
        Assertions.assertArrayEquals(release_01, release_02);
    }

    @Test
    void validateIsObjectNull() {
        People people = null;
        Assertions.assertNull(people);
    }

    @Test
    void validateIsObjectNotNull() {
        People people = new People("Kylian", LocalDate.of(2005, 5, 2));
        Assertions.assertNotNull(people);
    }

    @Test
    void validateTypes() {
        double value = 5d;
        float anotherValue = 5f;
        Assertions.assertEquals(value, anotherValue);
    }
}
