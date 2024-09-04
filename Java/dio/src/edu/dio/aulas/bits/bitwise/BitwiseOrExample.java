package edu.dio.aulas.bits.bitwise;

public class BitwiseOrExample {

    public static void main(String[] args) {
        int a = 7; // 0111
        int b = 4; // 0011 = 0111
        int result = a | b;

        System.out.println("Resultado = " + result);
        System.out.println(setLastTwoBits(20));
    }

    public static int setLastTwoBits(int n) {
        return n | 3;
    }

}
