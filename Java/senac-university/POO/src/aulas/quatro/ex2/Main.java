package aulas.quatro.ex2;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> drinks = new LinkedList<>(Arrays.asList("Rum", "Whiskey", "Caipirinha", "Cachaça"));

        while (true) {
            int option = JOptionPane.showConfirmDialog(null, "Deseja adicionar bebidas ao estoque?");

            if (option == 0) {
                String drink = JOptionPane.showInputDialog("Digite o nome da bebida!");
                if (!drinks.contains(drink)) drinks.add(drink);

                if (drinks.contains(drink)) throw new IllegalArgumentException("Essa bebida já existe, vadia!");

            } else {
                break;
            }
        }

        String response = JOptionPane.showInputDialog("Qual bebida o senhor deseja?");

        if (drinks.contains(response)) {
            drinks.remove(response);
            JOptionPane.showMessageDialog(null, "Bebida " + response + " removida com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Bebida não encontrada.");
        }
    }

}
