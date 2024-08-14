package aulas.dois.exceptions.word;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        while (true) {
            try {
                System.out.print("Digite uma frase: ");
                String frase = new Scanner(System.in).nextLine();

                System.out.print("Digite a palavra que deseja substituir: ");
                String palavraEscolhida = new Scanner(System.in).nextLine().trim();

                if (palavraEscolhida.isEmpty()) {
                    throw new IllegalArgumentException("Erro: A palavra escolhida não pode ser vazia.");
                }

                System.out.print("Digite a nova palavra: ");
                String palavraAlterar = new Scanner(System.in).nextLine().trim();

                if (palavraAlterar.isEmpty()) {
                    throw new IllegalArgumentException("Erro: A nova palavra não pode ser vazia.");
                }

                String fraseModificada = frase.replace(palavraEscolhida, palavraAlterar);

                System.out.println("Frase modificada: " + fraseModificada);
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
