package edu.dio.aulas.construtores.model;

public class People {

    long cpf;
    String name;
    private int cep;

    public People(long cpf) {
        this.cpf = cpf;
    }

    public long getCpf(){
        return cpf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCep() {
        return cep;
    }

    public void setCep(int cep) {
        this.cep = cep;
    }
}
