package edu.dio.aulas.collections.map.methods;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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

        System.out.println(moreEfficientModel);

    }
}
