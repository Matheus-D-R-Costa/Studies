package Material;

import java.util.HashMap;
import java.util.Map;

public class Material {

    public static void main(String[] args) {
        System.out.println(calculateFinalPrice('A', 'F', 34));
        System.out.println(calculateFinalPrice('A', 'f', 8.5));
        System.out.println(calculateFinalPrice('B', 'M', 20));
        System.out.println(calculateFinalPrice('S', 'G', 23.5));
    }

    public static String calculateFinalPrice(char material, char composition, double amount) {
        Map<Character, Double> basePrices = new HashMap<>();
        basePrices.put('A', 34.00);
        basePrices.put('P', 42.50);
        basePrices.put('B', 28.00);
        basePrices.put('S', 27.00);

        if (!basePrices.containsKey(material)) {
            return "Material inválido";
        }

        double basePrice = basePrices.get(material);

        double finalPrice;
        switch (Character.toUpperCase(composition)) {
            case 'F':
                finalPrice = basePrice;
                break;
            case 'M':
                finalPrice = basePrice * 1.15;
                break;
            case 'G':
                finalPrice = basePrice * 1.25;
                break;
            default:
                return "Composição inválida";
        }

        double totalSaleValue = finalPrice * amount;

        if (totalSaleValue < 750.00) {
            totalSaleValue += 45.00;
        }

        String formattedFinalPrice = String.format("%.2f", finalPrice);
        String formattedTotalSaleValue = String.format("%.2f", totalSaleValue);

        return formattedFinalPrice + ", " + formattedTotalSaleValue;

    }
}
