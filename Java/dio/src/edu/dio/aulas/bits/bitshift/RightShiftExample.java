package edu.dio.aulas.bits.bitshift;

public class RightShiftExample {

    // divide x por 2^n (onde n é o número que vc escolheu)
    public static void main(String[] args) {
        int a = 12; // 0000 1100
        int result = a >> 2; //0000 0011
        System.out.println("Resultado = " + result);

        System.out.println(divideByEight(128));
    }

    public static int divideByEight(int n) {
        return n >> 3;
    }

}
