package aulas.um.example;

public class User {

    private String name;
    private String lastName;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Nome: " + getName() + "\n" +
                "Sobrenome: " + getLastName() + "\n" +
                "Idade: " + getAge() + "\r";
    }
}
