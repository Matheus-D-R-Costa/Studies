package edu.dio.aulas.testes.random.challenges;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CpfValidator {

    public static void main(String[] args) {
        String cpf = JOptionPane.showInputDialog("Qual cpf desejas válidar?");
        validateCpf(cpf);
    }

    public static void validateCpf(String cpf) {
        if (!isElevenDigits(cpf)) {
            JOptionPane.showMessageDialog(null, "O cpf " + cpf + " é inválido.");
            return;
        }

        List<Integer> parsedCpf = stringToSplittedList(cpf);
        int penultimateDigit = checkPenultimateNumber(parsedCpf);
        int lastDigit = checkLastNumber(parsedCpf);

        if (parsedCpf.get(9) == penultimateDigit && parsedCpf.get(10) == lastDigit) {
            JOptionPane.showMessageDialog(null, "O cpf " + cpf + " é Válido.");
        } else {
            JOptionPane.showMessageDialog(null, "O cpf " + cpf + " é inválido.");
        }
    }

    private static boolean isElevenDigits(String cpf) {
        return cpf.length() == 11 && cpf.chars().allMatch(Character::isDigit);
    }

    private static List<Integer> stringToSplittedList(String cpf) {
        List<Integer> digits = new ArrayList<>();
        for (char ch : cpf.toCharArray()) {
            digits.add(Character.getNumericValue(ch));
        }
        return digits;
    }

    private static int checkPenultimateNumber(List<Integer> cpf) {
        int multiplier = 10;
        int sum = 0;
        for (int index = 0; index < 9; index++) {
            sum += cpf.get(index) * multiplier;
            multiplier--;
        }

        int remainder = sum % 11;
        if (remainder < 2) {
            return 0;
        } else {
            return 11 - remainder;
        }
    }

    private static int checkLastNumber(List<Integer> cpf) {
        int multiplier = 11;
        int sum = 0;
        for (int index = 0; index < 10; index++) {
            sum += cpf.get(index) * multiplier;
            multiplier--;
        }

        int remainder = sum % 11;
        if (remainder < 2) {
            return 0;
        } else {
            return 11 - remainder;
        }
    }
}