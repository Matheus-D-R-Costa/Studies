package aulas.sete.atv01;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Map<String, List<String>> peoples = new HashMap<>();
        peoples.put("Marcelo", new ArrayList<>(Arrays.asList("129.385.067-49", "Alto")));
        peoples.put("Jamal", new ArrayList<>(Arrays.asList("136.456.923-79", "Baixo")));
        peoples.put("Ana", List.of("472.930.672-33", "Alta"));
        peoples.put("Mariana", List.of("137.852.394-07", "Super Alta")); //Nota: List Of é melhor para esse caso.

        peoples.forEach((k, v) -> {
            System.out.println("Pessoa: " + k + " com os dados = " + v);
        });

    }


}
