package edu.dio.aulas.exceptions;

import java.io.*;

public class CheckedExceptions {

    public static void main(String[] args) {
        String archiveName = "romances-blake-crouch.txt";
        try {
            printArchive(archiveName);
        } catch (IOException e) {
            System.out.println(e.getCause());
        }

        System.out.println("...");
    }

    public static void printArchive(String archiveName) throws IOException {
        File file = new File(archiveName);

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file.getName()));
        String line = bufferedReader.readLine();

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));

        do {
            bufferedWriter.write(line);
            bufferedWriter.newLine();
            line= bufferedReader.readLine();
        } while (line != null);

        bufferedWriter.flush();
        bufferedReader.close();
    }
}
