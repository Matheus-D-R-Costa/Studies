package edu.dio.aulas.collections.stream.methods;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class StreamAPI_Examples {

    public static void main(String[] args) {
        List<String> randomNumbers = Arrays.asList("1", "0", "4", "1", "2", "3", "9", "9", "6", "5");

        System.out.println("--\tTodos os Elementos\t--");
        randomNumbers.forEach(System.out::print);

        System.out.println();

        System.out.println("--\tCinco Primeiros (Set)\t--");
        randomNumbers.stream()
                .limit(5)
                .collect(Collectors.toSet())
                .forEach(System.out::print);

        System.out.println();

        System.out.println("--\tLista de String para Lista de Integers\t--");
        List<Integer> randomNumbersInteger = randomNumbers.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        randomNumbersInteger.forEach(System.out::print);

        System.out.println();

        System.out.println("--\tNúmeros pares maiores que 2 (List)\t--");
        randomNumbers.stream()
                .map(Integer::parseInt)
                .filter(integer -> integer % 2 == 0 && integer > 2)
                .forEach(System.out::print);

        System.out.println();

        System.out.println("--\tMédia dos Números\t--");
        randomNumbers.stream()
                .mapToInt(Integer::parseInt)
                .average()
                .ifPresent(System.out::print);

        System.out.println();

        System.out.println("--\tRemovendo valores Ímpares\t--");
        randomNumbersInteger.removeIf(integer -> integer % 2 != 0);

        System.out.println(randomNumbersInteger);



    }
}
