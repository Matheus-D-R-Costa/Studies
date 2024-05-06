package edu.dio.aulas.nos;

public class Main {

    public static void main(String[] args) {

        Knot<String> knot_01 = new Knot<>("Cavalo knot_01");

        Knot<String> knot_02 = new Knot<>("Cavalo knot_02");
        knot_01.setNextKnot(knot_02);

        Knot<String> knot_03 = new Knot<>("Cavalo knot_03");
        knot_02.setNextKnot(knot_03);

        Knot<String> knot_04 = new Knot<>("Cavalo knot_04");
        knot_03.setNextKnot(knot_04);

        // knot_01 -> knot_02 -> knot_03 -> knot 04 -> null

        System.out.println(knot_01);
        System.out.println(knot_01.getNextKnot());

        System.out.println("---------------------");

        System.out.println(knot_01);
        System.out.println(knot_01.getNextKnot());
        System.out.println(knot_01.getNextKnot().getNextKnot());
        System.out.println(knot_01.getNextKnot().getNextKnot().getNextKnot());
        System.out.println(knot_01.getNextKnot().getNextKnot().getNextKnot().getNextKnot());


    }
}
