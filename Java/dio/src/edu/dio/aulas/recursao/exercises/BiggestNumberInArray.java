package edu.dio.aulas.recursao.exercises;

public class BiggestNumberInArray {

    public static void main(String[] args) {

        int[] array = {3, 5, 7, 2, 8, 6, 4, 9, 1};
        System.out.println(getBiggestNumberInArray(array));

    }

    public static int getBiggestNumberInArray(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty!");
        }

        return getBiggestNumberInArray(array, 0, array.length - 1);
    }

    private static int getBiggestNumberInArray(int[] array, int start, int end) {
        if (start == end) return array[start];

        int mid = (start + end) / 2;

        int leftMax = getBiggestNumberInArray(array, start, mid);
        int rightMax = getBiggestNumberInArray(array, mid + 1, end);

        return Math.max(leftMax, rightMax);
    }
}
