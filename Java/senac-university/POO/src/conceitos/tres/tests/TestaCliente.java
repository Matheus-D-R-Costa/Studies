package conceitos.tres.tests;

import conceitos.tres.models.Cliente;

import java.util.Scanner;

public class TestaCliente {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Cliente cliente01 = new Cliente();
        Cliente cliente02 = new Cliente();

        System.out.println("Digite um nome para o cliente...");
        cliente01.setName(scanner.next());

        System.out.println("Digite um código para o cliente...");
        cliente01.setCodigo(scanner.nextInt());

        System.out.println("Digite um nome para o outro cliente...");
        cliente02.setName(scanner.next());

        System.out.println("Digite um código para o outro cliente...");
        cliente02.setCodigo(scanner.nextInt());

        System.out.println("Cliente " + cliente01.getName() + " Tem o Código " + cliente01.getCodigo());
        System.out.println("Cliente " + cliente02.getName() + " Tem o Código " + cliente02.getCodigo());

    }

}
