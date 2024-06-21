package edu.dio.aulas.collections.map.exercises;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, State> statesInHashMap = new HashMap<>(){{
            put("PE", new State(9616621));
            put("AL", new State(3351543));
            put("CE", new State(9187103));
            put("RN", new State(3534265));
            put("PB", new State(3534165));
        }};

        System.out.println("--\tPopulação da Paraíba\t--");
        System.out.println("PB - " + statesInHashMap.get("PB").getPopulation() + " Pessoas.");
        System.out.println();

        System.out.println("--\tEstados e suas Populações em Ordem de Inserção");
        Map<String, State> statesInLinkedHashMap = new LinkedHashMap<>();
        statesInLinkedHashMap.put("PE", new State(9616621));
        statesInLinkedHashMap.put("AL", new State(3351543));
        statesInLinkedHashMap.put("CE", new State(9187103));
        statesInLinkedHashMap.put("RN", new State(3534265));
        statesInLinkedHashMap.put("PB", new State(3534165));
        printer(statesInLinkedHashMap);

        System.out.println("--\tEstados por Order Alfabética\t--");
        Map<String, State> statesInAlphabeticOrder = new TreeMap<>(statesInHashMap);
        printer(statesInAlphabeticOrder);

        System.out.println("--\tEstado com a Menor População\t--");
        State stateWithSmallestPopulation = Collections.min(statesInHashMap.values(), Comparator.comparingInt(State::getPopulation));
        Set<Map.Entry<String, State>> entries = statesInHashMap.entrySet();

        for (Map.Entry<String, State> entry : entries) {
            if (entry.getValue().equals(stateWithSmallestPopulation)) {
                System.out.println(entry.getKey() + " - " + entry.getValue().getPopulation() + " Pessoas.");
                System.out.println();
            }
        }

        System.out.println("--\tEstado com a Maior População\t--");
        State stateWithBiggestPopulation = Collections.max(statesInHashMap.values(), Comparator.comparingInt(State::getPopulation));

        for (Map.Entry<String, State> entry : entries) {
            if (entry.getValue().equals(stateWithBiggestPopulation)) {
                System.out.println(entry.getKey() + " - " + entry.getValue().getPopulation() + " Pessoas.");
                System.out.println();
            }
        }

        System.out.println("--\tSoma da População dos Estados\t--");
        int sum = 0;
        for (Map.Entry<String, State> state : entries) {
            sum += state.getValue().getPopulation();
        }

        System.out.println("NO/NE - " + sum + " Pessoas.");
        System.out.println();

        System.out.println("--\t Média da população dos Estados\t--");
        System.out.println("NO/NE - " + sum / statesInHashMap.size() + " Pessoas.");
        System.out.println( );

        System.out.println("--\t Estados com Mais de 4 milhões de pessoas.");
        Iterator<Map.Entry<String, State>> iterator = statesInHashMap.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, State> entry = iterator.next();
            if (entry.getValue().getPopulation() < 4000000) {
                iterator.remove();
            }
        }

        printer(statesInHashMap);

        statesInHashMap.clear();
        System.out.println("--\tEstados vazios?\t--");
        System.out.println(statesInHashMap.isEmpty());

        printer(statesInHashMap);

    }

    static void printer(Map<String, State> states) {
        Set<Map.Entry<String, State>> entries = states.entrySet();
        printer(entries);
    }

    static void printer(Set<Map.Entry<String, State>> states) {

        for (Map.Entry<String, State> state : states) {
            System.out.println(state.getKey() + " - " + state.getValue().getPopulation() + " Pessoas.");
        }

        System.out.println();

    }

    static Iterator<Integer> getPopulationIterator(Map<String, State> states) {
        return states.values().stream().map(State::getPopulation).iterator();
    }
}
