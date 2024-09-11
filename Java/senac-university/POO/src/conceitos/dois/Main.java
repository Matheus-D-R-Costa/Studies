package conceitos.dois;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        List<String> stock = new ArrayList<>();

        fillStock(stock);

        while (true) {
            printMenu();
            String option = SCANNER.next().toLowerCase(Locale.ROOT);

            switch (option) {
                case "1" -> showAllCars(stock);
                case "2" -> tryToBuyCar(stock);
                case "3:" -> System.exit(0);
                default -> System.out.println("Opção ausente.");
            }
        }

    }

    private static void fillStock(List<String> stock) {
        for (int i = 0; i < 6; i++) {
            try {
                String car = getCarIn();
                stock.add(car);
            } catch (IllegalArgumentException ex) {
                System.out.println(ex.getMessage());
            }
        }

        do {

            char option = getFillOptionIn();
            if (option == 'n') {
                break;
            }

            String car = getCarIn();
            stock.add(car);

        } while (true);

    }

    private static String getCarIn() {
        System.out.print("[CONCESSIONARIA]: Digite o nome do carro para ser adicionado:");
        String input = SCANNER.next().toLowerCase(Locale.ROOT);
        if (input.length() <= 2) {
            throw new IllegalArgumentException("Carro inválido...");
        }

        return input;

    }

    private static char getFillOptionIn() {
        System.out.println("[CONCESSIONARIA]: Você deseja continuar adicionando carros? (S/OUTRA TECLA)");
        return SCANNER.next().toLowerCase(Locale.ROOT).charAt(0);
    }

    private static void printMenu() {
        System.out.println("--------------------");
        System.out.println("1) Listar os carros do estoque");
        System.out.println("2) Comprar um carro");
        System.out.println("3) Sair");
        System.out.println("--------------------");
    }

    private static void showAllCars(List<String> stock) {
        System.out.println("--------------------");
        stock.forEach(System.out::println);
        System.out.println("--------------------");
    }

    private static void tryToBuyCar(List<String> stock) {
        String car = getCarOptionIn();

        if (!stock.contains(car)) {
            System.out.println("Carro inexistente no sistema.");
            return;
        }

        System.out.println("Carro existente no sistema.");

        char buyOption = getBuyOptionIn();

        if (buyOption != 's') {
            toMenuOut();
            return;
        }

        char tradeOption = getTradeOptionIn();

        if (tradeOption != 's') {
            buyCar(stock, car);
            return;
        }

        tradeCar(stock, car);

    }

    private static String getCarOptionIn() {
        System.out.println("[CONCESSIONARIA]: Qual o nome do carro que desejas comprar?");
        return SCANNER.next().toLowerCase(Locale.ROOT);
    }

    private static char getBuyOptionIn() {
        System.out.println("[CONCESSIONARIA]: Realmente desejas compra-lo? (S/OUTRA TECLA)");
        return SCANNER.next().toLowerCase(Locale.ROOT).charAt(0);
    }

    private static char getTradeOptionIn() {
        System.out.println("[CONCESSIONARIA]: Desejas dar o seu na troca? (S/OUTRA TECLA)");
        return SCANNER.next().toLowerCase(Locale.ROOT).charAt(0);
    }

    private static void toMenuOut() {
        System.out.println("[CONCESSIONARIA]: Retornando ao menu...");
    }

    private static void buyCar(List<String> stock, String car) {
        System.out.println("Carro Comprado!");
        deleteCar(stock, car);
    }

    private static void deleteCar(List<String> stock, String car) {
        stock.remove(car);
    }

    private static void tradeCar(List<String> stock, String car) {
        String carToTrade = getTradableCarOptionIn();
        int indexOfCar = stock.indexOf(car);

        replaceCar(stock, indexOfCar, carToTrade);
    }

    private static String getTradableCarOptionIn() {
        System.out.println("[CONCESSIONARIA]: Digite o nome do carro a ser trocado.");
        return SCANNER.next().toLowerCase(Locale.ROOT);
    }

    private static void replaceCar(List<String> stock, int index, String carToReplace) {
        System.out.println("Carro trocado!");
        stock.set(index, carToReplace);
    }

}