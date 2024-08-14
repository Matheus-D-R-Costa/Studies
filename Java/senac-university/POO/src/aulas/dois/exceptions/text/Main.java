package aulas.dois.exceptions.text;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                System.out.print("Digite um texto: ");
                String texto = new Scanner(System.in).nextLine();

                if (texto.isEmpty()) {
                    throw new IllegalArgumentException("Erro: O texto não pode estar vazio.");
                }

                int comprimentoTexto = texto.length();
                System.out.println("O texto possui " + comprimentoTexto + " caracteres.");

                break;

            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            } catch (NoSuchElementException e) {
                System.out.println("Erro: Nenhum elemento encontrado. Tente novamente.");
            } catch (Exception e) {
                System.out.println("Erro inesperado: " + e.getMessage());
            }
        }
    }
}
