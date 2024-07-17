package edu.dio.aulas.io.sequential;

import edu.dio.aulas.io.sequential.controller.ChooseFile;
import edu.dio.aulas.io.sequential.models.RegAgenda;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;

public class MainQuery {

    static StringBuffer memory = new StringBuffer();

    public static void main(String[] args) {
        try {
            String archive = ChooseFile.path();
            BufferedReader archiveInput = new BufferedReader(new FileReader(archive));

            String name = JOptionPane.showInputDialog("Digite o Nome").toUpperCase();
            String address = "";
            String telephone = "";

            String line;
            while ((line = archiveInput.readLine()) != null) {
                memory.append(line).append("\r\n");
            }

            archiveInput.close();

            int start = memory.indexOf(name);

            if (start != -1) {
                int last = memory.indexOf("\t", start);
                name = read(start, last);

                int first = last + 1;
                last = memory.indexOf("\t", first);
                address = read(first, last);

                first = last + 1;
                int end = memory.indexOf("\t", first);
                telephone = read(first, end);

                RegAgenda regAgenda = new RegAgenda(name, address, telephone);

                JOptionPane.showMessageDialog(null, "Endereço: " + regAgenda.getAddress()
                        + "\n" + "Telefone: " + regAgenda.getTelephone());
            } else {
                JOptionPane.showMessageDialog(null, "Não Cadastrado");
            }

        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Erro de Leitura: " + err.getMessage());
        }

    }

    public static String read(int first, int last) {
        return memory.substring(first, last);
    }
}
