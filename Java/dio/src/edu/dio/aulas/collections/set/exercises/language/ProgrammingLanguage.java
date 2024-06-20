package edu.dio.aulas.collections.set.exercises.language;

public class ProgrammingLanguage implements Comparable<ProgrammingLanguage> {

    private String name;
    private Integer yearOfBorn;
    private String IDE;

    public String getName() {
        return name;
    }

    public Integer getYearOfBorn() {
        return yearOfBorn;
    }

    public String getIDE() {
        return IDE;
    }

    public ProgrammingLanguage(String name, Integer yearOfBorn, String IDE) {
        this.name = name;
        this.yearOfBorn = yearOfBorn;
        this.IDE = IDE;
    }

    @Override
    public String toString() {
        return "ProgrammingLanguage{" +
                "name='" + name + '\'' +
                ", yearOfBorn=" + yearOfBorn +
                ", IDE='" + IDE + '\'' +
                '}';
    }

    @Override
    public int compareTo(ProgrammingLanguage programmingLanguage) {
        return this.name.compareToIgnoreCase(programmingLanguage.name);
    }
}
