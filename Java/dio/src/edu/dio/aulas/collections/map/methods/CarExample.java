package edu.dio.aulas.collections.map.methods;

import java.util.*;

public class CarExample {

//  static Map<String, Double> popularCars = new HashMap<>(); // antes do java 5
//  static HashMap<String, Double> popularCars = new HashMap<>();
    static Map<String, Double> popularCars = new HashMap<>();

    public static void main(String[] args) {
        popularCars.put("Honda Accord", 21d);
        popularCars.put("Bmw 320i", 15d);
        popularCars.put("Honda Civic", 12d);
        popularCars.put("Ford Fusion", 13d);
        popularCars.put("Hyundai Azera", 12d);
        popularCars.put("Chevrolet Omega", 8d);
        System.out.println(popularCars);

        popularCars.put("Chevrolet Omega", 5d);
        System.out.println(popularCars);

        System.out.println(popularCars.containsKey("Chevrolet Cruize"));

        System.out.println(popularCars.get("Ford Fusion"));

        System.out.println(popularCars.keySet());

        System.out.println(popularCars.values());

        Double bestConsumption = Collections.max(popularCars.values());
        Set<Map.Entry<String, Double>> entries = popularCars.entrySet();
        String moreEfficientModel = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(bestConsumption)) {
                moreEfficientModel = entry.getKey();
            }
        }

        System.out.println("Modelo mais eficiente: " + moreEfficientModel + " - " + bestConsumption + " Km/l");

        Double worstConsumption = Collections.min(popularCars.values());
        String lessEfficientModel = "";

        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(worstConsumption)) {
                lessEfficientModel = entry.getKey();
            }
        }

        System.out.println("Modelo menos eficiente: " + lessEfficientModel + " - " + worstConsumption + " Km/l");

        Double sum = 0d;
        for (Double consumption : popularCars.values()) {
            sum += consumption;
        }

        System.out.println("Soma do comsumos = " + sum);

        System.out.println("Média dos consumos = " + sum / popularCars.size());

        Iterator<Double> iterator = popularCars.values().iterator();
        while (iterator.hasNext()) {
            if (iterator.next() < 13d) {
                iterator.remove();
            }
        }

        System.out.println("Carros com consumo maior ou igual a 13 Km/l = " + popularCars);

        Map<String, Double> popularCarsInLinkedHashMap = new LinkedHashMap<>();
        popularCarsInLinkedHashMap.put("Honda Accord", 21d);
        popularCarsInLinkedHashMap.put("Bmw 320i", 15d);
        popularCarsInLinkedHashMap.put("Honda Civic", 12d);
        popularCarsInLinkedHashMap.put("Ford Fusion", 13d);
        popularCarsInLinkedHashMap.put("Hyundai Azera", 12d);
        popularCarsInLinkedHashMap.put("Chevrolet Omega", 8d);
        System.out.println("Carros em ordem de inserção = " + popularCarsInLinkedHashMap);

        Map<String, Double> popularCarsInTreeMap = new TreeMap<>(popularCarsInLinkedHashMap);
        System.out.println("Carros em Ordem Alfabética = " + popularCarsInTreeMap);

        popularCars.clear();

        System.out.println(popularCars.isEmpty());
    }
}
