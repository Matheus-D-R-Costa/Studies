package aulas.cinco.atv;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Map<String, String> regions = new HashMap<>();
        regions.put("88130-375", "Servidão B");
        regions.put("11038-734", "Av paulistão");
        regions.put("88132-235", "Rua Goiaba");
        regions.put("88130-600", "Servidão A");
        regions.put("23252-352", "Beco dos 5");

        regions.forEach((k, v) -> {
            System.out.println(v);
        });

        while (true) {

            printMenu();
            String option = scanner.next().toLowerCase(Locale.ROOT);


        }

    }

    public static void printMenu() {
        System.out.println("--------------------");
        System.out.println("1) Listar os Endereços.");
        System.out.println("2) Verificar se um cep está no sistema.");
        System.out.println("3) Listar os ceps.");
        System.out.println("--------------------");
    }
}
