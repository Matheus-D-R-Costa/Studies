package edu.dio.aulas.collections.set.ordened;

import java.util.Comparator;

public class ComparatorGenre implements Comparator<Serie> {
    @Override
    public int compare(Serie s1, Serie s2) {
        int genre = s1.getGenre().compareToIgnoreCase(s2.getGenre());
        if (genre != 0) return genre;

        int episodes = Integer.compare(s1.getEpisodes(), s2.getEpisodes());
        if (episodes != 0) return episodes;

        return 0;
    }
}
