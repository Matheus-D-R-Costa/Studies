package aulas.nove;

import java.util.Set;

public class Car {

    private Set<People> owners;
    private String name;
    private String color;

    public Car(Set<People> owners, String name, String color) {
        this.owners = owners;
        this.name = name;
        this.color = color;
    }

    public Set<People> getOwners() {
        return owners;
    }

    public void setOwners(Set<People> owners) {
        this.owners = owners;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        StringBuilder ownersNames = new StringBuilder();

        if (this.owners != null && !this.owners.isEmpty()) {
            this.owners.forEach(owner -> ownersNames.append(owner.getName()).append(", "));
            if (ownersNames.length() > 0) {
                ownersNames.setLength(ownersNames.length() - 2);
            }
        } else {
            ownersNames.append("No owners");
        }

        return String.format("Car Details:%nName: %s%nColor: %s%nOwners: %s",
                name,
                color,
                ownersNames.toString());
    }

}
