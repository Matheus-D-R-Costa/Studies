package edu.senac.intro.aulas.vintequatro;

import java.util.Scanner;

public class Matrix {

    static Scanner scanner = new Scanner(System.in);
    static int[][] firstMatrix;
    static int[][] secondMatrix;
    static int number;

    public static void main(String[] args) {
        firstMatrix = createMatrix(3, 3);
        secondMatrix = createMatrix(3, 3);

        int[][] resultMatrix = sumMatrix(firstMatrix, secondMatrix);

        System.out.println("Primeira Matriz:");
        printMatrix(firstMatrix);

        System.out.println("Segunda Matriz:");
        printMatrix(secondMatrix);

        System.out.println("Matriz Resultante:");
        printMatrix(resultMatrix);
    }

    static int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        fillMatrix(rows, columns, matrix);
        return matrix;
    }

    static void fillMatrix(int rows, int columns, int[][] matrix) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.println("Número para colocar na linha " + (i + 1) + " na coluna " + (j + 1) + ":");
                number = scanner.nextInt();
                matrix[i][j] = number;
            }
        }
    }

    static int[][] sumMatrix(int[][] matrixA, int[][] matrixB) {
        int rows = matrixA.length;
        int columns = matrixA[0].length;
        int[][] resultMatrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return resultMatrix;
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
