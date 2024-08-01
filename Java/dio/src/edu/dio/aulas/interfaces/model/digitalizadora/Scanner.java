package edu.dio.aulas.interfaces.model.digitalizadora;

import java.io.InputStream;

public class Scanner implements Digitalizadora{
    public Scanner(InputStream in) {
    }

    @Override
    public void digitar() {
        System.out.println("Digitando via Scanner");
    }
}
