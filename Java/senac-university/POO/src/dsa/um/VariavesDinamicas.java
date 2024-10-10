package dsa.um;

import java.util.Scanner;

public class VariavesDinamicas {

    public static void main(String[] args) {
        // Criar objeto Scanner para ler entrada do usuário
        Scanner entrada = new Scanner(System.in);

        // Declarar variáveis dinâmicas
        int idade;
        double altura;
        String nome;
        boolean estudante;

        // Pedir informações para o usuário
        System.out.print("Digite seu nome: ");
        nome = entrada.nextLine();

        System.out.print("Digite sua idade: ");
        idade = entrada.nextInt();

        System.out.print("Digite sua altura: ");
        altura = entrada.nextDouble();

        System.out.print("Você é estudante? (true/false): ");
        estudante = entrada.nextBoolean();

        // Imprimir informações na tela
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
        System.out.println("Estudante? " + estudante);

        // Fechar objeto Scanner
        entrada.close();
    }
}
