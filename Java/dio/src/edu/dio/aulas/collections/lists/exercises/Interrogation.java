package edu.dio.aulas.collections.lists.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Interrogation {

    public static void main(String[] args) {
        List<Boolean> responses = gatherResponses();
        classifySuspect(responses);
    }

    static List<Boolean> gatherResponses() {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        List<Boolean> responses = new ArrayList<>();

        responses.add(askQuestion(scanner, "Telefonou para a vítima?"));
        responses.add(askQuestion(scanner, "Esteve no local do crime?"));
        responses.add(askQuestion(scanner, "Mora perto da vítima?"));
        responses.add(askQuestion(scanner, "Devia para a vítima."));
        responses.add(askQuestion(scanner, "Já trabalhou com a vítima?"));

        return responses;
    }

    static Boolean askQuestion(Scanner scanner, String question) {
        System.out.println(question);

        while (true) {
            String reply = scanner.next().toLowerCase();
            if (reply.charAt(0) == 's') {
                return true;
            } else if (reply.charAt(0) == 'n') {
                return false;
            } else {
                System.out.println("Opção inválida, responda com (S/N)");
            }
        }
    }

    static void classifySuspect(List<Boolean> responses) {
        long positiveResponses = responses.stream().filter(Boolean::booleanValue).count();

        if (positiveResponses == 2) {
            System.out.println("Suspeito.");
        } else if (positiveResponses == 3 || positiveResponses == 4) {
            System.out.println("Cúmplice.");
        } else if (positiveResponses == 5) {
            System.out.println("Assasino.");
        } else {
            System.out.println("Inocente.");
        }
    }

}
