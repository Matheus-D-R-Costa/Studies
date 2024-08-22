package TriangularNumber;

import java.util.Scanner;

public class TriangularNumber {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite um número natural N: ");
    int N = scanner.nextInt();

    int triangularNumber = triangular(N);
    System.out.println("O " + N + "-ésimo número triangular é: " + triangularNumber);

    System.out.println("Triângulo correspondente:");
    printTriangle(N, 1);

    scanner.close();
  }

  public static int triangular(int n) {
    if (n == 1) {
      return 1;
    } else {
      return n + triangular(n - 1);
    }
  }

  public static void printTriangle(int n, int currentRow) {
    if (currentRow > n) {
      return;
    }

    for (int i = 0; i < n - currentRow; i++) {
      System.out.print(" ");
    }

    for (int i = 0; i < currentRow; i++) {
      System.out.print("* ");
    }

    System.out.println();
    printTriangle(n, currentRow + 1);

  }

}
