package aulas.cinco.example;

import java.util.*;

public class MapExample {

    public static void main(String[] args) {
        Map<String, Double> carAndAverageConsumption = new HashMap<>();
        carAndAverageConsumption.put("Honda Accord", 21d);
        carAndAverageConsumption.put("Bmw 320i", 15d);
        carAndAverageConsumption.put("Honda Civic", 12d);
        carAndAverageConsumption.put("Ford Fusion", 13d);
        carAndAverageConsumption.put("Hyundai Azera", 12d);
        carAndAverageConsumption.put("Chevrolet Omega", 8d);

        Double bestConsumption = Collections.max(carAndAverageConsumption.values());

        String moreEfficient = "";
        for (Map.Entry<String, Double> entry : carAndAverageConsumption.entrySet()) {
            if (Objects.equals(entry.getValue(), bestConsumption)) moreEfficient = entry.getKey();
        }

        System.out.println("O carro mais eficiente é " + moreEfficient + " com um consumo de " + bestConsumption);

    }
}
