package edu.dio.aulas.io;

public class RegAgenda {
    private String name;
    private String address;
    private String telephone;

    public RegAgenda (String name, String address, String telephone) {
        this.name = name;
        this.address = address;
        this.telephone = telephone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephone() {
        return telephone;
    }
}
