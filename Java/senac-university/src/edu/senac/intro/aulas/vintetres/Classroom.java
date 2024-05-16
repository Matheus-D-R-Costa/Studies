package edu.senac.intro.aulas.vintetres;

public class Classroom {

    static String[] names = new String[10];

    public static void main(String[] args) {

        for (int index = 0; index < names.length; index++) {
            names[index] = "SuperHorse";
            System.out.println(names[index] + " no indice --> " + index);
        }
    }
}
