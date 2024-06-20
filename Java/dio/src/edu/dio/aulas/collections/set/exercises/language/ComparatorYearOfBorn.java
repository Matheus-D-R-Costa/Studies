package edu.dio.aulas.collections.set.exercises.language;

import java.util.Comparator;

public class ComparatorYearOfBorn implements Comparator<ProgrammingLanguage> {

    @Override
    public int compare(ProgrammingLanguage p1, ProgrammingLanguage p2) {
        return Integer.compare(p1.getYearOfBorn(), p2.getYearOfBorn());
    }
}
