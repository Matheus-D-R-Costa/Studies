package edu.dio.aulas.testes.random.challenges.Region;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Region {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("#.##");
        List<Inhabitant> inhabitants = new ArrayList<>();
        inhabitants.add(new Inhabitant('M', "Brown", "Black", 25, 1.75, 70.0));
        inhabitants.add(new Inhabitant('F', "Blue", "Blonde", 30, 1.65, 60.0));
        inhabitants.add(new Inhabitant('M', "Green", "Brown", 22, 1.80, 75.0));
        inhabitants.add(new Inhabitant('F', "Hazel", "Red", 28, 1.70, 65.0));
        inhabitants.add(new Inhabitant('M', "Blue", "Blonde", 35, 1.78, 80.0));
        inhabitants.add(new Inhabitant('F', "Green", "Blonde", 27, 1.68, 58.0));
        inhabitants.add(new Inhabitant('M', "Brown", "Brown", 40, 1.82, 90.0));
        inhabitants.add(new Inhabitant('F', "Blue", "Red", 24, 1.60, 55.0));
        inhabitants.add(new Inhabitant('M', "Hazel", "Black", 29, 1.74, 72.0));
        inhabitants.add(new Inhabitant('F', "Brown", "Blonde", 26, 1.67, 61.0));
        inhabitants.add(new Inhabitant('M', "Green", "Brown", 31, 1.76, 78.0));
        inhabitants.add(new Inhabitant('F', "Blue", "Black", 33, 1.63, 59.0));
        inhabitants.add(new Inhabitant('M', "Brown", "Blonde", 36, 1.85, 85.0));
        inhabitants.add(new Inhabitant('F', "Green", "Red", 22, 1.69, 64.0));
        inhabitants.add(new Inhabitant('M', "Hazel", "Brown", 28, 1.77, 73.0));
        inhabitants.add(new Inhabitant('F', "Brown", "Black", 25, 1.72, 62.0));
        inhabitants.add(new Inhabitant('F', "Blue", "Blonde", 30, 1.79, 76.0));
        inhabitants.add(new Inhabitant('M', "Hazel", "Brown", 27, 1.66, 57.0));
        inhabitants.add(new Inhabitant('F', "Green", "Black", 32, 1.81, 79.0));
        inhabitants.add(new Inhabitant('F', "Blue", "Red", 29, 1.64, 60.0));
        inhabitants.add(new Inhabitant('M', "Green", "Blonde", 21, 1.93, 95.0));

        System.out.println("Média de idade da região: " + df.format(calculateAverageAge(inhabitants)) + " anos.");
        System.out.println("Média de peso e altura respectivamente: " + df.format(calculateAverageWeight(inhabitants)) + " kgs e " + df.format(calculateAverageHeight(inhabitants)) + " cm.");
        System.out.println("Porcentagem de mulheres: " + df.format(calculatePercentageOfWoman(inhabitants)) + "%");
        System.out.println("Porcentagem de homens: " + df.format(calculatePercentageOfMen(inhabitants)) + "%");
        System.out.println("Porcentagem de habitantes com olhos verdes e cabelos louros: " + df.format(calculatePercentageOfInhabitantsWithGreenEyesAndBlondeHair(inhabitants)) + "%");
    }

    public static double calculateAverageAge(List<Inhabitant> inhabitants) {
        double ages = 0;
        for (Inhabitant inhabitant : inhabitants) {
            ages += inhabitant.getAge();
        }
        return ages / inhabitants.size();
    }

    public static double calculateAverageWeight(List<Inhabitant> inhabitants) {
        double weights = 0;
        for (Inhabitant inhabitant : inhabitants) {
            weights += inhabitant.getWeight();
        }
        return weights / inhabitants.size();
    }

    public static double calculateAverageHeight(List<Inhabitant> inhabitants) {
        double heights = 0;
        for (Inhabitant inhabitant : inhabitants) {
            heights += inhabitant.getHeight();
        }
        return heights / inhabitants.size();
    }

    public static double calculatePercentageOfWoman(List<Inhabitant> inhabitants) {
        double women = 0;
        for (Inhabitant inhabitant : inhabitants) {
            if (inhabitant.getSex() == 'F') {
                women++;
            }
        }
        return (women / inhabitants.size()) * 100;
    }

    public static double calculatePercentageOfMen(List<Inhabitant> inhabitants) {
        double men = 0;
        for (Inhabitant inhabitant : inhabitants) {
            if (inhabitant.getSex() == 'M') {
                men++;
            }
        }
        return (men / inhabitants.size()) * 100;
    }

    public static double calculatePercentageOfInhabitantsWithGreenEyesAndBlondeHair(List<Inhabitant> inhabitants) {
        double inhabitantsGreenBlonde = 0;
        for (Inhabitant inhabitant : inhabitants) {
            if (inhabitant.getEyeColor().equals("Green") && inhabitant.getHairColor().equals("Blonde")) {
                inhabitantsGreenBlonde++;
            }
        }
        return (inhabitantsGreenBlonde / inhabitants.size()) * 100;
    }
}
