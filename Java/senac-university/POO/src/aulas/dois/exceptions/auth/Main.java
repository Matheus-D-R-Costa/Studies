package aulas.dois.exceptions.auth;

import java.util.Scanner;

public class Main {

    private static final String CORRECT_LOGIN = "usuario";
    private static final String CORRECT_PASSWORD = "senha123";

    public static void main(String[] args) {
        authUser();
    }

    private static void authUser() {
        try (Scanner scanner = new Scanner(System.in)) {
            String userLogin = getLogin(scanner);
            String userPassword = getPassword(scanner);

            boolean authenticated = verifyCredentials(userLogin, userPassword);

            showAuthenticationMessage(authenticated);
        } catch (Exception e) {
            System.out.println("Ocorreu um erro durante a autenticação.");
            e.printStackTrace();
        }
    }

    private static String getLogin(Scanner scanner) {
        System.out.print("Digite seu login: ");
        return scanner.nextLine();
    }

    private static String getPassword(Scanner scanner) {
        System.out.print("Digite sua senha: ");
        return scanner.nextLine();
    }

    private static boolean verifyCredentials(String login, String password) {
        return CORRECT_LOGIN.equals(login) && CORRECT_PASSWORD.equals(password);
    }

    private static void showAuthenticationMessage(boolean authenticated) {
        if (authenticated) {
            System.out.println("Usuário logado com sucesso!");
        } else {
            System.out.println("Login ou senha inválidos.");
        }
    }
}
