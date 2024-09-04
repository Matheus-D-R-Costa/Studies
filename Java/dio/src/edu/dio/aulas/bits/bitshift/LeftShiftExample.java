package edu.dio.aulas.bits.bitshift;

public class LeftShiftExample {

    // multiplica x por 2^n (onde n é o número que vc escolheu)
    public static void main(String[] args) {
        int a = 3; // 0000 0011
        int result = a << 2; //0000 1100
        System.out.println("Resultado = " + result);

        System.out.println(multiplyByFour(4));
    }

    public static int multiplyByFour(int n) {
        return n << 2;
    }

}
