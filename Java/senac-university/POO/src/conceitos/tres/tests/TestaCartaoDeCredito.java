package conceitos.tres.tests;

import conceitos.tres.models.CartaoDeCredito;

import java.util.Scanner;

public class TestaCartaoDeCredito {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        CartaoDeCredito card01 = new CartaoDeCredito();
        CartaoDeCredito card02 = new CartaoDeCredito();

        System.out.println("Digte um número para o cartão...");
        card01.setNumero(scanner.nextInt());

        System.out.println("Digite uma data de validade para o cartão...");
        card01.setDataDeValidade(scanner.next());

        System.out.println("Digte um número para outro cartão...");
        card02.setNumero(scanner.nextInt());

        System.out.println("Digite uma data de validade para o outro cartão...");
        card02.setDataDeValidade(scanner.next());

        System.out.println(card01.getNumero() + " | " + card01.getDataDeValidade());
        System.out.println(card02.getNumero() + " | " + card02.getDataDeValidade());


    }

}
