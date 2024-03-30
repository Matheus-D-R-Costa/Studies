package aula12;

public class auxFunctions {

    public static void calculateTotalWage(double mensalWage, int forfeitDays) {
        double percentage = 0.85;
        double totalWage = forfeitDays >= 5 ? mensalWage * percentage : mensalWage;
        System.out.printf("Seu salário final é de: " + totalWage + " Reais.");
    }

    public static void fabricateTribute(int items) {

        double isTaxed = items >= 20 ? 13 : 10;
        double product = isTaxed * items;
        System.out.println(product);
    }

    public static void calculateFinalWage (int forfeitDays, int TotalProductsSold) {
        double DiscountPerMissedDays = 0.85;
        double wage = 1000;
        double discountedWage = forfeitDays >= 5 ? wage * DiscountPerMissedDays : wage;
        double isTaxed = TotalProductsSold >= 20 ? 13 : 10;
        double product = isTaxed * TotalProductsSold;
        double maxWage = discountedWage + product >= 2000 ? 2000 : discountedWage + product;

        System.out.printf(String.valueOf(maxWage) + " Reais.");

    }
}
