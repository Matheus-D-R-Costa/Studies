package edu.dio.aulas.testes.random.challenges;

public class Height {

    public static void main(String[] args) {

        double pedroHeight = 1.50;
        double lucasHeight = 1.70;

        int years = calculateTimeToHeightEquals(pedroHeight, lucasHeight);

        System.out.println("Demorou " + years + " anos para as alturas se igualarem");
    }

    public static int calculateTimeToHeightEquals(double lowestHeight, double higherHeight) {
        double epsilon = 0.000001;

        int years = 0;
        while (Math.abs(lowestHeight - higherHeight) > epsilon) {
            lowestHeight += 0.03;
            higherHeight += 0.02;
            years++;
        }

        return years;
    }
}
