package edu.dio.aulas.interfaces.model.digitalizadora;

public class Scanner implements Digitalizadora{
    @Override
    public void digitar() {
        System.out.println("Digitando via Scanner");
    }
}
