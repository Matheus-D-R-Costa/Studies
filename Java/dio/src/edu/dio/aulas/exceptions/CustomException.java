package edu.dio.aulas.exceptions;

import java.io.*;

public class CustomException {

    public static void main(String[] args) {
        String fileName = "romances-blake-crouch.txt";

        printOutArchive(fileName);

        System.out.println("chegou até aqui...");
    }

    public static void printOutArchive(String archiveName) {

        try {
            BufferedReader br = readFile(archiveName);
            String line = br.readLine();
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            do {
                bw.write(line);
                bw.newLine();
                line = br.readLine();
            } while (line != null);

            bw.flush();
            br.close();
        } catch (FileOpeningUnableException | IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public static BufferedReader readFile(String fileName) throws FileOpeningUnableException {
        File file = new File(fileName);

        try {
            return new BufferedReader(new FileReader(fileName));

        } catch (FileNotFoundException ex) {
            throw new FileOpeningUnableException(file.getName(), file.getPath());
        }

    }
}

class FileOpeningUnableException extends Exception {

    private String fileName;
    private String path;

    public FileOpeningUnableException(String path, String fileName) {
        super("O arquivo " + fileName + " não foi encontrado no diretório " + path);
        this.path = path;
        this.fileName = fileName;
    }


}
