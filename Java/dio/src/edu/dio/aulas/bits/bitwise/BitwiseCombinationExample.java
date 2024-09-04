package edu.dio.aulas.bits.bitwise;

public class BitwiseCombinationExample {

    public static void main(String[] args) {
        int a = 12; // 0000 1100
        int b = 5; // 0000 0101

        int mask = 0x0F; // 0000 1111
        int result = (a & mask) | b;

        System.out.println("Resultado = " + result);
    }

    public static int applyMaskAndSetBits(int n, int mask, int m) {
        return (n & mask) | m;
    }

}
