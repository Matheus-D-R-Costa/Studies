package edu.dio.aulas.collections.map.exercises;

public class State {

    private Integer population;

    public State(Integer population) {
        this.population = population;
    }

    public Integer getPopulation() {
        return population;
    }

    @Override
    public String toString() {
        return "State{" +
                "population=" + population +
                '}';
    }
}
