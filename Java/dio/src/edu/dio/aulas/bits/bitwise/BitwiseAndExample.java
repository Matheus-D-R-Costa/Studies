package edu.dio.aulas.bits.bitwise;

public class BitwiseAndExample {
    public static void main(String[] args) {
        int a = 6; // 0110
        int b = 3; // 0011 = 0010

        int result = a & b;
        System.out.println("Resultado = " + result);
        System.out.println(isEven(7));
    }

    public static boolean isEven(int n) {
        if((n & 1) == 0) return true;

        return false;

    }
}

// 1 = 0001
// 2 = 0010
// 3 = 0011
// 4 = 0100
// 5 = 0101
// 6 = 0110
