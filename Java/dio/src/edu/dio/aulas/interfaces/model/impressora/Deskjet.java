package edu.dio.aulas.interfaces.model.impressora;

public class Deskjet implements Impressora {
    @Override
    public void imprimir() {
        System.out.println("Imprimindo Deskjet");
    }
}
