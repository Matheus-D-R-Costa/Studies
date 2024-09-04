package edu.dio.aulas.bits.bitshift;

public class UnsignedRightShiftExample {
    public static void main(String[] args) {
        int a = -12;  // Em binário (com sinal): 1111 1111 1111 1111 1111 1111 1111 0100
        int result = a >>> 2; // 1111 1111 1111 1111 1111 1111 1111 0100 >>> 2 = 0011 1111 1111 1111 1111 1111 1111 1101 (em decimal) = 1073741821

        System.out.println("Resultado de -12 >>> 2: " + result); // Output: 1073741821
    }
}

