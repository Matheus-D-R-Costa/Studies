package edu.dio.aulas.bits.bitwise;

public class BitwiseNotExample {

    public static void main(String[] args) {
        int a = 6; // 0000 0110
        int result = ~ a; // 1111 1001
        System.out.println("Resultado = " + result);
    }

    public static int complement(int n) {
        return ~ n;
    }

}
