package edu.dio.aulas.collections.set.exercises.rainbow;

import java.util.Set;

public class Main {

    static Rainbow rainbow = new Rainbow();

    public static void main(String[] args) {
        rainbow.displayColors();
        rainbow.displayNumberOfColors();
        rainbow.displayColorsInAlphabeticalOrder();
        rainbow.displayColorsInReverseOrder();
        rainbow.displayColorsThatBeginWithTheLetter('v');
        rainbow.removeColorsThatBeginWithTheLetter('v');
        rainbow.clear();
        System.out.println(rainbow.isEmpty());

    }
}
