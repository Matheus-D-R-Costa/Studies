package edu.dio.aulas.recursao.exercises;

public class SumOfN {

    public static void main(String[] args) {
        System.out.println(sumBetween0andX(3));
    }

    public static int sumBetween0andX(int x) {
        if (x == 0) return 0;

        return x + sumBetween0andX(x -1);
    }
}
