package edu.dio.aulas.collections.lists.exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Temperature {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Double> temperatures = new ArrayList<>();
    static String[] months = {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho"};

    public static void main(String[] args) {

        addTemperatures();
        showAverageTemperature(temperatures);
    }

    static void addTemperatures() {
        for (int i = 0; i < months.length; i++) {
            System.out.println("Qual a temperatura média do mês de " + months[i]);
            double temperature = scanner.nextDouble();
            temperatures.add(temperature);
        }
    }

    static void showAverageTemperature(ArrayList<Double> temperaturesList) {
        if (temperaturesList.size() != months.length) {
            System.out.println("Erro: o número de temperaturas não corresponde ao número de meses.");
            return;
        }

        for (int i = 0; i < months.length; i++) {
            System.out.println("Temperatura média do mês de " + months[i] + " = " + temperaturesList.get(i) + " °C");
        }

        System.out.println("Temperatura Semestral média = " + calculateAverageTemperature(temperatures) + " °C");

    }

    private static double calculateAverageTemperature(ArrayList<Double> temperatures) {
        Double averageTemperature = 0.0;
        for (Double temperature : temperatures) {
            averageTemperature += temperature / temperatures.toArray().length;
        }

        return averageTemperature;

    }

}
