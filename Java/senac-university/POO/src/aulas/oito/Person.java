package aulas.oito;

public class Person {

    private int age;
    private String name;
    private double height;
    private double weight;

    public void kill(Person person) {
        System.out.println("A pessoa " + this.name + " matou o " + person.name + "...");
        person = null;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
