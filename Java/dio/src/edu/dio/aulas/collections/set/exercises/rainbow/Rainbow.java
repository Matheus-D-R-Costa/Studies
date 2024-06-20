package edu.dio.aulas.collections.set.exercises.rainbow;

import java.util.*;

public class Rainbow {

    private final Set<String> COLORS = new LinkedHashSet<>(Arrays.asList("Vermelho", "Laranja", "Amarelo", "Verde", "Azul", "Anil", "Violeta"));

    public void displayColors() {
        System.out.println();
        System.out.println("--\tCores do Arco Irís\t--");

        for (String color : this.COLORS) {
            System.out.println(color);
        }
    }

    public void displayNumberOfColors() {
        System.out.println();
        System.out.println("--\tNúmero de Cores\t--");

        System.out.println(COLORS.size());
    }

    public void displayColorsInAlphabeticalOrder() {
        Set<String> sortedColors = new TreeSet<>(COLORS);

        System.out.println();
        System.out.println("--\tCores em Ordem Alfabética\t--");

        for (String sortedColor : sortedColors) {
            System.out.println(sortedColor);
        }
    }

    public void displayColorsInReverseOrder() {
        ArrayList<String> colors = new ArrayList<>(COLORS);
        Collections.reverse(colors);

        System.out.println();
        System.out.println("--\tCores em Ordem Reversa\t--");

        for (String color : colors) {
            System.out.println(color);
        }
    }

    public void displayColorsThatBeginWithTheLetter(char letter) {
        char lowerCaseLetter = Character.toLowerCase(letter);

        System.out.println();
        System.out.println("--\tCores que começam com " + letter + "\t--");

        for (String color : COLORS) {
            if (color.toLowerCase().charAt(0) == lowerCaseLetter) {
                System.out.println(color);
            }
        }
    }

    public void removeColorsThatBeginWithTheLetter(char letter) {
        char lowerCaseLetter = Character.toLowerCase(letter);

        System.out.println();
        System.out.println("--\tCores removidas com a letra " + letter + "\t--");

        Iterator<String> iterator = COLORS.iterator();
        while (iterator.hasNext()) {
            String color = iterator.next();
            if (color.toLowerCase().charAt(0) == lowerCaseLetter) {
                iterator.remove();
                System.out.println(color);
            }
        }
    }

    public void clear() {
        COLORS.clear();
    }

    public boolean isEmpty() {
        System.out.println();
        System.out.println("--\tEstá vazio?\t--");

        return COLORS.isEmpty();
    }

    public Set<String> getCOLORS() {
        return COLORS;
    }
}

