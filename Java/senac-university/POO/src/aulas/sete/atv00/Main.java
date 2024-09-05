package aulas.sete.atv00;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> regions = initializeRegions();

        while (true) {
            printMenu();
            String option = SCANNER.next().toLowerCase(Locale.ROOT);

            switch (option) {
                case "1":
                    showAllAddresses(regions);
                    break;
                case "2":
                    handleCepCheck(regions);
                    break;
                case "3":
                    showAllCeps(regions);
                    break;
                case "4":
                    exitProgram();
                    break;
                default:
                    System.out.println("Opção inexistente");
            }
        }
    }

    private static Map<String, String> initializeRegions() {
        Map<String, String> regions = new HashMap<>();
        regions.put("88130-375", "Servidão B");
        regions.put("11038-734", "Av Paulistão");
        regions.put("88132-235", "Rua Goiaba");
        regions.put("88130-600", "Servidão A");
        regions.put("23252-352", "Beco dos 5");
        return regions;
    }

    private static void printMenu() {
        System.out.println("--------------------");
        System.out.println("1) Listar os endereços");
        System.out.println("2) Verificar se um CEP está no sistema");
        System.out.println("3) Listar os CEPs");
        System.out.println("4) Sair");
        System.out.println("--------------------");
    }

    private static void showAllAddresses(Map<String, String> regions) {
        System.out.println("Endereços:");
        regions.values().forEach(System.out::println);
        System.out.println("--------------------");
    }

    private static void handleCepCheck(Map<String, String> regions) {
        String cep = getCepInput();
        if (regions.containsKey(cep)) {
            regions.remove(cep);
            System.out.println("CEP removido do sistema.");
        } else {
            System.out.println("CEP ausente no sistema.");
        }
    }

    private static String getCepInput() {
        System.out.println("Digite o CEP no formato (xxxxx-xxx):");
        return SCANNER.next();
    }

    private static void showAllCeps(Map<String, String> regions) {
        System.out.println("CEPs:");
        regions.keySet().forEach(System.out::println);
        System.out.println("--------------------");
    }

    private static void exitProgram() {
        System.out.println("Saindo do programa...");
        System.exit(0);
    }
}
