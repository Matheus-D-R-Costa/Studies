package edu.dio.aulas.io.character;

import java.io.*;

public class IOcharacterExample03 {

    public static void main(String[] args) {
        copyFile("/home/tteu/Documentos/projectsGitHub/Studies/Java/dio/recomendacoes.txt");
    }

    public static void copyFile(String pathName) {
        File file = new File(pathName);

        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = bufferedReader.readLine();

            String copyFileName = file.getName().substring(0, file.getName().indexOf(".")).concat("-copy.txt");

            File copiedFile = new File(copyFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(copiedFile.getName()));

            do {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
                line = bufferedReader.readLine();
            } while (line != null);

            System.out.printf("Arquivo \"%s\" copiado com sucesso!", file);

            PrintWriter printWriter = new PrintWriter(System.out);
            printWriter.println("Recomende 3 livros");
            printWriter.flush();

            addInfoOnFile(copiedFile);

            bufferedReader.close();
            bufferedWriter.close();
            printWriter.close();


        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public static void addInfoOnFile(File file) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            String line = bufferedReader.readLine();

            do {
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                line = bufferedReader.readLine();
            } while (!line.equalsIgnoreCase("fim"));

            bufferedReader.close();
            bufferedWriter.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }



    }

}
