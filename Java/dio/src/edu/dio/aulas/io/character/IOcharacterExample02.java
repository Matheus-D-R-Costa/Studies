package edu.dio.aulas.io.character;

import java.io.*;
import java.util.Scanner;

public class IOcharacterExample02 {

    public static void main(String[] args) {
        getKeyboardInputAndWriteInDocument();
    }

    public static void getKeyboardInputAndWriteInDocument() {

        PrintWriter pw = new PrintWriter(System.out);
        pw.println("Digite 3 recomendações de filmes: ");
        pw.flush();

        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();

        File file = new File("recomendacoes.txt");

        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(file.getName()));

            do {
                bw.write(line);
                bw.newLine();
                bw.flush();
                line = scanner.nextLine();
            } while (!line.equalsIgnoreCase("fim"));

            pw.printf("Arquivo \"%s\" foi criado com sucesso!", file.getName());

            pw.close();
            scanner.close();
            bw.close();

        } catch (IOException ex) {
            System.err.println(ex.getMessage());
        }

    }
}
