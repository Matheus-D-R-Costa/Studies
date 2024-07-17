package edu.dio.aulas.io.sequential;

import edu.dio.aulas.io.sequential.controller.ChooseFile;
import edu.dio.aulas.io.sequential.models.RegAgenda;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class MainUpdate {

    static StringBuffer memory = new StringBuffer();
    static String archive = ChooseFile.path();

    public static void main(String[] args) {
        try {
            BufferedReader archiveInput ;
            archiveInput = new BufferedReader(new FileReader(archive));

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

                address = JOptionPane.showInputDialog(null, "Entre com o novo endereço").toUpperCase();
                regAgenda.setAddress(address);

                telephone = JOptionPane.showInputDialog(null, "Entre com o novo telefone").toUpperCase();
                regAgenda.setTelephone(telephone);

                memory.replace(start, end + 1,
                        regAgenda.getName() + "\t" +
                        regAgenda.getAddress() + "\t" +
                        regAgenda.getTelephone() + "\r\n");

                save();

                JOptionPane.showMessageDialog(null, "Atualização realizada com sucesso");

            } else {
                JOptionPane.showMessageDialog(null, "Não cadastrado!");
            }

            archiveInput.close();

        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Erro de leitura:" + err.getMessage());
        }
    }

    public static String read(int first, int last) {
        String data = "";
        data = memory.substring(first, last);
        return data;
    }

    public static void save() {
        try {
            BufferedWriter output;
            output = new BufferedWriter(new FileWriter (archive));
            output.write(memory.toString());
            output.flush();
            output.close();
        } catch (Exception err) {
            JOptionPane.showMessageDialog(null, "Erro de gravação " + err.getMessage());
        }
    }
}
