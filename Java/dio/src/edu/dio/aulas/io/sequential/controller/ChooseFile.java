package edu.dio.aulas.io.sequential.controller;

import javax.swing.*;
import java.io.File;

public class ChooseFile {

    public static String path() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);

        int result = fileChooser.showOpenDialog(null);
        if (result == JFileChooser.CANCEL_OPTION) return null;

        File archive = fileChooser.getSelectedFile();
        if (archive == null || archive.getName().equals("")) {
            JOptionPane.showMessageDialog(null, "Nome do arquivo inválido!");
        } else {
            return archive.getPath();
        }

        return null;
    }
}
