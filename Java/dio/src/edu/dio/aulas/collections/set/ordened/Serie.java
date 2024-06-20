package edu.dio.aulas.collections.set.ordened;

import java.util.Objects;

public class Serie implements Comparable<Serie> {

    private String name;
    private String genre;
    private Integer episodes;

    public Serie(String name, String genre, Integer episodes) {
        this.name = name;
        this.genre = genre;
        this.episodes = episodes;
    }

    public String getName() {
        return name;
    }

    public String getGenre() {
        return genre;
    }

    public Integer getEpisodes() {
        return episodes;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        edu.dio.aulas.collections.set.ordened.Serie serie = (edu.dio.aulas.collections.set.ordened.Serie) object;
        return Objects.equals(name, serie.name) && Objects.equals(genre, serie.genre) && Objects.equals(episodes, serie.episodes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, genre, episodes);
    }

    @Override
    public int compareTo(Serie serie) {
        int name = this.getName().compareToIgnoreCase(serie.getName());
        if (name != 0) return name;

        int genre = this.getGenre().compareToIgnoreCase(serie.getGenre());
        if (genre != 0) return genre;

        int episodes = Integer.compare(this.getEpisodes(), serie.getEpisodes());
        if (episodes != 0) return episodes;

        return 0;
    }
}
