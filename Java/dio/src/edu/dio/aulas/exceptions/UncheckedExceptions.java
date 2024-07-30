package edu.dio.aulas.exceptions;

import javax.swing.*;

public class UncheckedExceptions {

    public static void main(String[] args) {
        String a = JOptionPane.showInputDialog("Numerador:");
        String b = JOptionPane.showInputDialog("Denominador:");

        try {
            int result = divide(Integer.parseInt(a), Integer.parseInt(b));
            System.out.println("Resultado: " + result);
        } catch (NumberFormatException exception) {
            JOptionPane.showMessageDialog(null, "Entrada inválida.");
        } catch (ArithmeticException exception) {
            JOptionPane.showMessageDialog(null, "Impossível dividir um número por 0");
        } finally {
            System.out.println("chegou até aqui...");
        }

    }

    public static int divide(int a, int b) {
        return a / b;
    }

}
