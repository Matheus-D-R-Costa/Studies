package edu.dio.aulas.atribuicao;

public class Main {

    public static void main(String[] args) {

        int intA = 1;
        int intB = intA; // mesmo valor que intA, porém estão armazenadas em locais diferentes.

        System.out.println("intA = " + intA + ", intB = " + intB);
        intA = 2; // tipos primitivos copiam exatamente o tipo de memória (não apotam o mesmo endereço de memória)
        System.out.println("intA = " + intA + ", intB = " + intB);

        MyObj objA = new MyObj(1);
        MyObj objB = objA; // objetos copiam a referência de memória (apotam o mesmo endereço de memória)

        System.out.println("objA = " + objA + ", objB = " + objB);
        objA.setNum(2);
        System.out.println("objA = " + objA + ", objB = " + objB);
    }
}
