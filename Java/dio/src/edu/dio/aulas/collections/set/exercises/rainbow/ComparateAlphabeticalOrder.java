package edu.dio.aulas.collections.set.exercises.rainbow;

import java.util.Comparator;

public class ComparateAlphabeticalOrder implements Comparator<Rainbow> {

    @Override
    public int compare(Rainbow r1, Rainbow r2) {
        return r1.getCOLORS().iterator().next().compareToIgnoreCase(r2.getCOLORS().iterator().next());
    }
}
