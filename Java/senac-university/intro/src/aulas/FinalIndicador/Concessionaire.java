package edu.senac.intro.aulas.FinalIndicador;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Concessionaire {

    static Scanner scanner = new Scanner(System.in);
    static String[] cars;
    static String option = "";

    public static void main(String[] args) {
        fillStock();

        while (true) {

            System.out.println("--------------------");
            System.out.println("1) Comprar um carro.");
            System.out.println("2) Verificar estoque.");
            System.out.println("3) Sair da concessionária.");
            System.out.println("--------------------");

            option = scanner.next().toLowerCase(Locale.ROOT);

            switch (option) {
                case "1":
                    System.out.println("Digite o nome do carro para verificarmos a disponibilidade.");
                    String car = scanner.next();
                    buyCar(car);
                    break;

                case "2":
                    showCars();
                    break;

                case "3":
                    System.out.println("Aplicação Encerrada.");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }
    }

    static void fillStock() {
        System.out.println("Digite o número inicial de carros no estoque:");
        int initialStock = scanner.nextInt();
        scanner.nextLine();
        cars = new String[initialStock];

        for (int i = 0; i < initialStock; i++) {
            System.out.println("Digite o nome do carro para adicionar ao estoque:");
            cars[i] = scanner.nextLine();
        }

        System.out.println("Deseja adicionar mais carros? (S/N)");
        option = scanner.next().toLowerCase(Locale.ROOT);

        if (option.charAt(0) == 's') {
            System.out.println("Quantos carros desejas adicionar?");
            int additionalCars = scanner.nextInt();
            scanner.nextLine();

            cars = Arrays.copyOf(cars, cars.length + additionalCars);

            for (int i = cars.length - additionalCars; i < cars.length; i++) {
                System.out.println("Digite o nome do carro para adicionar ao estoque:");
                cars[i] = scanner.nextLine();
            }
        }

        System.out.println("Estoque inicial concluído.");
    }

    private static void showCars() {
        System.out.println("--------------------");
        System.out.println("Estoque: " + Arrays.toString(cars));
        System.out.println("--------------------");
    }

    static void buyCar(String car) {
        if (carExists(car)) {
            System.out.println("Deseja comprar o carro? (S/N)");
            String option = scanner.next().toLowerCase(Locale.ROOT);

            if (option.charAt(0) == 's') {
                System.out.println("Desejas dar algum carro em troca? (S/N)");
                option = scanner.next().toLowerCase(Locale.ROOT);

                if (option.charAt(0) == 's') {
                    System.out.println("Digite o nome do seu carro.");
                    String carToReplace = scanner.next();
                    replaceCar(car, carToReplace);
                    System.out.println("Troca feita. Obrigado pela preferência.");
                } else {
                    deleteCar(car);
                    System.out.println("Carro comprado. Obrigado pela preferência.");
                }
            } else {
                System.out.println("Retornando ao menu inicial.");
            }
        }
    }

    static boolean carExists(String carName) {
        for (String car : cars) {
            if (carName.equalsIgnoreCase(car)) {
                System.out.println("--------------------");
                System.out.println("Carro existente no estoque.");
                System.out.println("--------------------");
                return true;
            }
        }

        System.out.println("--------------------");
        System.out.println("Carro inexistente no estoque.");
        System.out.println("--------------------");
        return false;

    }

    static void deleteCar(String carName) {
        int index = -1;
        for (int i = 0; i < cars.length; i++) {
            if (carName.equalsIgnoreCase(cars[i])) {
                index = i;
                break;
            }
        }

        if (index != -1) {
            String[] newCars = new String[cars.length - 1];
            System.arraycopy(cars, 0, newCars, 0, index);
            System.arraycopy(cars, index + 1, newCars, index, cars.length - index - 1);
            cars = newCars;
        }
    }

    static void replaceCar(String car, String carToReplace) {
        for (int i = 0; i < cars.length; i++) {
            if (car.equalsIgnoreCase(cars[i])) {
                cars[i] = carToReplace;
                break;
            }
        }
    }
}
