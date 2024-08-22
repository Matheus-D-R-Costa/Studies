package aulas.quatro.ex2;

import javax.swing.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> drinks = new LinkedList<>(Arrays.asList("Rum", "Whiskey", "Caipirinha", "Cachaça"));

        String response = JOptionPane.showInputDialog("Qual bebida o senhor deseja?");

        if (drinks.contains(response)) {
            drinks.remove(response);
            JOptionPane.showMessageDialog(null, "Bebida " + response + " removida com sucesso.");
        } else {
            JOptionPane.showMessageDialog(null, "Bebida não encontrada.");
        }
    }
}
