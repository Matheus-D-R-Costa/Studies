package org.example;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class People {
    private String name;
    private LocalDate born;

    public People(String name, LocalDate born) {
        this.name = name;
        this.born = born;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBorn() {
        return born;
    }

    public int getAge() {
        return (int) ChronoUnit.YEARS.between(this.born, LocalDate.now());
    }

    public boolean isMajorAge() {
        return getAge() >= 18;
    }

}