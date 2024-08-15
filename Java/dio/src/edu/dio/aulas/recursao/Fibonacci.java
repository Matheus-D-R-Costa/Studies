package edu.dio.aulas.recursao;

public class Fibonacci {

    public static void main(String[] args) {
        int n= 10;

        Long startTime = System.currentTimeMillis();
        Integer nonRecursiveResult = nonRecursiveFibonacci(n);
        long endTime = System.currentTimeMillis();
        double nonRecursiveDuration = (endTime - startTime) / 1000.0;
        System.out.println("Non-recursive Fibonacci result for n = " + n + ": " + nonRecursiveResult);
        System.out.println("Time taken (non-recursive): " + nonRecursiveDuration + " seconds\n");

        startTime = System.currentTimeMillis();
        Integer recursiveResult = recursiveFibonacci(n);
        endTime = System.currentTimeMillis();
        double recursiveDuration = (endTime - startTime) / 1000.0;
        System.out.println("Recursive Fibonacci result for n = " + n + ": " + recursiveResult);
        System.out.println("Time taken (recursive): " + recursiveDuration + " seconds");
    }

    // O(n)
    public static Integer nonRecursiveFibonacci(Integer n) {
        if (n == 1) return 0;
        if (n == 2) return 1;

        int last = 1;
        int penultimate = 0;

        for (int idx = 3; idx <= n; idx++) {
            int following = last + penultimate;
            penultimate = last;
            last = following;
        }

        return last;

    }

    // O(n!)
    public static Integer recursiveFibonacci(Integer n) {
        int num = 0;

        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else if (n >= 3) {
            num = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }

        return num;

    }

}
