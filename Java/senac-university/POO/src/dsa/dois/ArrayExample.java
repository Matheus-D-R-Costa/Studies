package dsa.dois;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String[] args) {

        int numbers[] = new int[5];

        fillArray(numbers);

        System.out.println(Arrays.toString(numbers));

    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
    }
}
