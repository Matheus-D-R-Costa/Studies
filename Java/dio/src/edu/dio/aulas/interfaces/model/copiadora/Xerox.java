package edu.dio.aulas.interfaces.model.copiadora;

public class Xerox implements Copiadora{

    @Override
    public void copiar() {
        System.out.println("Copiando via xerox");
    }
}
