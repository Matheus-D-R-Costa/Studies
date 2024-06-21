package edu.dio.aulas.collections.map.exercises;

import java.util.Comparator;
import java.util.Map;

public class ComparatorPopulation implements Comparator<Map.Entry<String, State>> {

    @Override
    public int compare(Map.Entry<String, State> s1, Map.Entry<String, State> s2) {
        return Integer.compare(s1.getValue().getPopulation(), s2.getValue().getPopulation());
    }
}
