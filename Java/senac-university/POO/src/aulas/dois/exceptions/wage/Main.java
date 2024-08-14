package aulas.dois.exceptions.wage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("Digite o valor do salário mínimo: ");
                double salarioMinimo = new Scanner(System.in).nextDouble();

                System.out.print("Digite o valor do salário do funcionário: ");
                double salarioFuncionario = new Scanner(System.in).nextDouble();

                if (salarioMinimo <= 0 || salarioFuncionario <= 0) {
                    throw new IllegalArgumentException("Erro: Os valores devem ser maiores que zero.");
                }

                double quantidadeSalariosMinimos = salarioFuncionario / salarioMinimo;
                System.out.printf("O funcionário ganha %.2f salários mínimos.%n", quantidadeSalariosMinimos);

                break;

            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Por favor, insira um número válido.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
    }
}
