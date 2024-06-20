package edu.dio.aulas.collections.set.ordened;

import java.util.*;

public class SeriesExample {

    static Set<Serie> seriesInHashSet = new HashSet<>() {{
        add(new Serie("Breaking Bad", "Drama", 62));
        add(new Serie("Vikings", "Adventure", 89));
        add(new Serie("Top boy", "Drama", 32));
    }};

    public static void main(String[] args) {

        System.out.println("--\tOrdem aleatória\t--");
        for (Serie serie : seriesInHashSet) {
            System.out.println(serie);
        }

        System.out.println();

        System.out.println("--\tOrdem de inserção\t--");
        Set<Serie> seriesInLinkedHashSet = new LinkedHashSet<>(seriesInHashSet);

        for (Serie serie : seriesInLinkedHashSet) {
            System.out.println(serie);
        }

        System.out.println();

        System.out.println("--\tOrdem natural\t--");
        Set<Serie> seriesInTreeSet = new TreeSet<>(seriesInHashSet);

        for (Serie serie : seriesInTreeSet) {
            System.out.println(serie);
        }

        System.out.println();

        System.out.println("--\tOrdem de gênero\t--");
        Set<Serie> seriesInGenreOrder = new TreeSet<>(new ComparatorGenre());
        seriesInGenreOrder.addAll(seriesInHashSet);

        for (Serie serie : seriesInGenreOrder) {
            System.out.println(serie);
        }

        System.out.println();

        System.out.println("--\tOrdem por número de episodios\t--");
        Set<Serie> seriesInCrescentNumberOrder = new TreeSet<>(new ComparatorEpisodes());
        seriesInCrescentNumberOrder.addAll(seriesInHashSet);

        for (Serie serie : seriesInCrescentNumberOrder) {
            System.out.println(serie);
        }

    }
}


