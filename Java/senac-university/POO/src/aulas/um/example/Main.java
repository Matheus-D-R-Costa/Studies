package aulas.um.example;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        User adrianoImperador = new User();

        adrianoImperador.setAge(42);
        adrianoImperador.setName("Adriano");
        adrianoImperador.setLastName("Imperador");

        JOptionPane.showMessageDialog(null, adrianoImperador);
    }

}
