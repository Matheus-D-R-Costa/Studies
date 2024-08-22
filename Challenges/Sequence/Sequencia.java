package Sequence;

import java.util.Arrays;

public class Sequencia {
    public static void main(String[] args) {
        int index = 5;
        int[] sequencia = generateSequence(index);

        System.out.println(Arrays.toString(sequencia));
    }

    public static int[] generateSequence(int index) {
        int X = 2;
        int numElementos = index + 1;
        int[] sequence = new int[numElementos];

        for (int i = 0; i <= index; i++) {
            if (i % 2 == 0) {
                int nLarge = (i / 2) + 1;
                sequence[i] = (int) Math.pow((X * (X + nLarge)), 4);
            } else {
                int nSmall = (i / 2);
                sequence[i] = X * (X + nSmall);
            }
        }

        return sequence;

    }
}
