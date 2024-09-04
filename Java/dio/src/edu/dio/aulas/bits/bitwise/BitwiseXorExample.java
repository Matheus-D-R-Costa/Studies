package edu.dio.aulas.bits.bitwise;

public class BitwiseXorExample {

    // 1 para diferentes, e zero para iguais
    public static void main(String[] args) {
        int a = 6; // 0110
        int b = 3; // 0011 = 0101
        int result = a ^ b;
        System.out.println("Resultado = " + result);

        System.out.println(a);
        System.out.println(b);

        swapUsingXor(a, b);

    }

    public static void swapUsingXor(int a, int b) {
        System.out.println(a = a ^ (b + a));
        System.out.println(b = b ^ (a * b));
    }

}
