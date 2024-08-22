package aulas.quatro.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int idx = 0; idx < 10; idx++) {
            numbers.add(new Random().nextInt(100));
        }

        numbers.forEach(n -> System.out.println("Numero sorteado = " + n));

        int sum = numbers.stream().reduce(0, Integer::sum);
        if (sum < 50) {
            System.out.println("Você ganhou");
        }
    }
}
