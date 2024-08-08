package edu.dio.aulas.io.bytes;

import java.io.*;

public class IObytesExample01 {

    public static void main(String[] args) {
        copyFile("/home/tteu/Documentos/projectsGitHub/Studies/Java/dio/recomendacoes-copy.txt");
    }

    public static void copyFile(String pathName) {
        File file = new File(pathName);
        String fileName = file.getName();

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file.getName()));
            String nameOfCopiedFile = fileName.substring(0, fileName.indexOf("-")).concat("-copy2.txt");
            File copiedFile = new File(nameOfCopiedFile);

            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(nameOfCopiedFile));

            int line;
            while ((line = bis.read()) != -1) {
                bos.write((char) line);
                bos.flush();
            }

            bis.close();
            bos.close();

            PrintStream ps = new PrintStream(System.out);
            ps.printf("Arquivo %s copiado com sucesso e está no diretório %s com %d bytes ",
                    copiedFile.getName(), copiedFile.getPath(), copiedFile.length());
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
