package edu.senac.intro.aulas.indicador5;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Parking {

    static Scanner scanner = new Scanner(System.in);
    static String[] parking = new String[10];
    static String newCarPlate;

    public static void main(String[] args) {

        for (int i = 0; i < parking.length; i++) {
            while (true) {
                System.out.println("Digite a placa do carro que sera guardado na vaga " + (i + 1));
                newCarPlate = scanner.nextLine().toUpperCase(Locale.ROOT);

                if (isPlateInParking(newCarPlate)) {
                    System.out.println("Essa placa já existe no sistema. Por favor declare outra.");
                } else {
                    parking[i] = newCarPlate;
                    break;
                }
            }
        }

        System.out.println(Arrays.toString(parking));

    }

    static boolean isPlateInParking(String plate) {
        for (String carPlate : parking) {
            if (plate.equals(carPlate)) {
                return true;
            }
        }
        return false;
    }
}
