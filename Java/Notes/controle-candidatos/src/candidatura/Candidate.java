package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class Candidate {
private String name;

    public Candidate(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    static double desiredSalary() {
        return ThreadLocalRandom.current().nextDouble(1500, 3000);
    }
}
