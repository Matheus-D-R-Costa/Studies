package aulas.dois.exceptions.horses;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("Digite o número de cavalos: ");
                int numeroCavalos = new Scanner(System.in).nextInt();

                if (numeroCavalos < 0) {
                    throw new IllegalArgumentException("Erro: O número de cavalos não pode ser negativo.");
                }

                int ferradurasPorCavalo = 4;
                int totalFerraduras = numeroCavalos * ferradurasPorCavalo;

                System.out.println("Número total de ferraduras necessárias: " + totalFerraduras);
                break;

            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número inteiro.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
    }
}
