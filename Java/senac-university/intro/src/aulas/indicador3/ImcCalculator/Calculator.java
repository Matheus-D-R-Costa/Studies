package edu.senac.intro.aulas.indicador3.ImcCalculator;


public class Calculator {

    double height;
    String sex;
    double imc;

    public Calculator(double height, String sex) {
        this.height = height;
        this.sex = String.valueOf(sex.charAt(0)).toLowerCase();
        switch (sex) {
            case "f" :
                calculateWoman(height);
                break;
            case "m" :
                calculateMen(height);
                break;
        }
    }

    public double getHeight() {
        return height;
    }

    public String getSex() {
        return sex;
    }

    private double calculateWoman(double height) {
        return imc = (62.1 * height) - 44.7;
    }

    private double calculateMen(double height) {
        return imc = (72.7 * height) - 58;
    }
}
