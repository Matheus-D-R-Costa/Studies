package aulas.seis;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Map<String, String> accounts = initializeAccounts();

        while (true) {
            printMenu();
            String option = scanner.next();

            switch (option) {
                case "1" -> addNewAccount(accounts);
                case "2" -> handleAccountCheck(accounts);
                case "3" -> exitProgram();
                default -> System.out.println("Opção inválida! Tente novamente.");
            }
        }
    }

    public static Map<String, String> initializeAccounts() {
        Map<String, String> defaultAccounts = new HashMap<>();
        defaultAccounts.put("ADMIN", "123456");
        defaultAccounts.put("USER", "asdfgh");
        return defaultAccounts;
    }

    public static void printMenu() {
        System.out.println("--------------------");
        System.out.println("1) Adicionar novas contas.");
        System.out.println("2) Verificar a existência de uma conta.");
        System.out.println("3) Sair.");
        System.out.println("--------------------");
    }

    private static String getNameInput() {
        System.out.print("Digite o nome: ");
        return scanner.next();
    }

    private static String getPasswdInput() {
        System.out.print("Digite a senha: ");
        return scanner.next();
    }

    public static void addNewAccount(Map<String, String> accounts) {
        String name = getNameInput();
        String passwd = getPasswdInput();

        if (!isValidPasswd(passwd)) {
            System.out.println("Senha Inválida! A senha deve ter pelo menos 6 caracteres.");
        } else {
            accounts.put(name, passwd);
            System.out.println("Conta criada com sucesso!");
        }
    }

    public static boolean isValidPasswd(String passwd) {
        return passwd.length() >= 6;
    }

    public static void handleAccountCheck(Map<String, String> accounts) {
        String name = getNameInput();
        String passwd = getPasswdInput();

        if (accounts.containsKey(name) && accounts.get(name).equals(passwd)) {
            System.out.println("Conta existente!");
        } else {
            System.out.println("Conta inexistente!");
        }
    }

    public static void exitProgram() {
        System.out.println("Saindo do programa...");
        System.exit(0);
    }
}
