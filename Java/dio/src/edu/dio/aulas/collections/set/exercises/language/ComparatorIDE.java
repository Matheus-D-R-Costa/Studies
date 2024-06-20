package edu.dio.aulas.collections.set.exercises.language;

import java.util.Comparator;

public class ComparatorIDE implements Comparator<ProgrammingLanguage> {

    @Override
    public int compare(ProgrammingLanguage p1, ProgrammingLanguage p2) {
        return p1.getIDE().compareToIgnoreCase(p2.getIDE());
    }
}
