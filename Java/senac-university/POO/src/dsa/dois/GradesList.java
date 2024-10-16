package dsa.dois;

import java.util.ArrayList;
import java.util.List;

public class GradesList {

    public static void main(String[] args) {
        List<Double> grades = new ArrayList<>(
                List.of(7d, 8d, 9d, 6d, 10d)
        );

        grades.forEach(System.out::println);

        double sum = grades.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        double average = sum / grades.size();

        System.out.println("A média das notas é: " + average);
    }
}
