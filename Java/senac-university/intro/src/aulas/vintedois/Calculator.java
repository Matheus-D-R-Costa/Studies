package edu.senac.intro.aulas.vintedois;

public class Calculator {

    static int[] naturalNumbers = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    public static void main(String[] args) {
        System.out.println(calculateSumOfArithmeticProgression(naturalNumbers));;
    }

    public static Integer calculateSumOfArithmeticProgression(int[] arr) {

        if (isArithmeticProgression(arr)) {
            int sum = arr.length * (arr[0] + arr[arr.length - 1]) / 2;
            return sum;
        }
        return null;
    }

    public static boolean isArithmeticProgression(int[] arr) {
        int ratio = arr[1] - arr[0];

        for (int index = 2; index < arr.length; index++) {

            if (arr[index] - arr[index - 1] != ratio) {
                return false;
            }
        }
        return true;
    }
}
