package edu.dio.aulas.collections.set.ordened;

import java.util.Comparator;

public class ComparatorEpisodes implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        return Integer.compare(s1.getEpisodes(), s2.getEpisodes());
    }
}
