package conceitos.tres.tests;

import conceitos.tres.models.Lancamento;

import java.util.Scanner;

public class TestaLancamento {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma descrição para o lançamento...");
        Lancamento lancamento01 = new Lancamento(scanner.nextLine());

        System.out.println("Digite uma outra descrição para outro lançamento...");
        Lancamento lancamento02 = new Lancamento(scanner.nextLine());

        System.out.println("Digite um valor do primeiro lançamento...");
        lancamento01.setValor(scanner.nextDouble());

        System.out.println("Digite outro valor para o segundo lançamento");
        lancamento02.setValor(scanner.nextDouble());

        lancamento01.setPago(true);

        System.out.println(lancamento01.getDescricao() + " | " + lancamento01.getValor() + " | " + lancamento01.isPago());
        System.out.println(lancamento02.getDescricao() + " | " + lancamento02.getValor() + " | " + lancamento02.isPago());

    }

}
