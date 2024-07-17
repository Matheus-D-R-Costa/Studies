package edu.dio.aulas.io;

import javax.swing.*;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class Main {

    public static void main(String[] args) {
        try {
            String archive = ChooseFile.path();
            BufferedWriter output = new BufferedWriter(new FileWriter(archive, true));

            String name = JOptionPane.showInputDialog("Digite o nome").toUpperCase();
            String address = JOptionPane.showInputDialog("Digite o endereço").toUpperCase();
            String telephone = JOptionPane.showInputDialog("Digite o telefone").toUpperCase();

            RegAgenda regAgenda = new RegAgenda(name, address, telephone);

            output.write(regAgenda.getName() + "\t");
            output.write(regAgenda.getAddress() + "\t");
            output.write(regAgenda.getTelephone() + "\t\n");
            output.flush();
            output.close();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Erro de acesso ao arquivo");
        }
    }
}
