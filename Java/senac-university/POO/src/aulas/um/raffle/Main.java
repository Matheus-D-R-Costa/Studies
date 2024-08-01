package aulas.um.raffle;

public class Main {

    public static void main(String[] args) {

        Raffle raffle = new Raffle(60);

        do {

            raffle.roll();
            System.out.println("Número: " + raffle.getNumber());

        } while (raffle.isCorrectNumber() == false);
    }
}
