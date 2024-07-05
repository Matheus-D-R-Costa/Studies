package edu.dio.aulas.collections.stream.examples;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 5, 6, 4);

        // Usar o Consumer com expressão lambda para imprimir números pares
        Consumer<Integer> printOddNumbers = number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        };

        numbers.stream().forEach(printOddNumbers);

        // com Stream
        numbers.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

    }
}

