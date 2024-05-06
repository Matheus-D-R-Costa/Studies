package edu.dio.aulas.interfaces.model;

import edu.dio.aulas.interfaces.model.copiadora.Copiadora;
import edu.dio.aulas.interfaces.model.digitalizadora.Digitalizadora;
import edu.dio.aulas.interfaces.model.impressora.Impressora;

public class EquipamentoMultifuncional implements Impressora, Copiadora, Digitalizadora {
    @Override
    public void copiar() {
        System.out.println("Copiando");
    }

    @Override
    public void digitar() {
        System.out.println("Digitalizando");
    }

    @Override
    public void imprimir() {
        System.out.println("Imprimindo");
    }
}
