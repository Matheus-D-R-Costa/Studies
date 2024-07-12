package edu.dio.aulas.testes.random.challenges.Region;

public class Inhabitant {
    private char sex;
    private String eyeColor;
    private String hairColor;
    private int age;
    private double height;
    private double weight;

    public Inhabitant(char sex, String eyeColor, String hairColor, int age, double height, double weight) {
        this.sex = sex;
        this.eyeColor = eyeColor;
        this.hairColor = hairColor;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public char getSex() {
        return sex;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public String getHairColor() {
        return hairColor;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }
}
