package aulas.nove;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<People> owners = new HashSet<>(){{
            add(new People("Joana", 21));
            add(new People("Jefferson", 23));
        }};

        Car fiesta = new Car(owners, "Fiesta", "black");

        System.out.println(fiesta);

    }
}
