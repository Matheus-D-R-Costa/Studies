package edu.dio.aulas.operadores;

public class Operators {
    public static void main(String[] args) {
        String name = "Kylian";
        int age = 27;
        double weight = 91.5;
        char gender = 'M';
        boolean organDover = false;

        int numero = 5;
        System.out.println(- numero); // numero negativo
        numero ++;
        System.out.println(numero);
        System.out.println(numero ++);// ops algo de errado não está certo
        System.out.println(numero);
        System.out.println(++ numero);
        boolean verdadeiro = true;
        System.out.println("Inverteu " + !verdadeiro);


        int a, b;

        a = 5;
        b = 6;

        String resultado = (a == b) ? "verdadeiro" : "false";

        System.out.println(resultado);
    }
}