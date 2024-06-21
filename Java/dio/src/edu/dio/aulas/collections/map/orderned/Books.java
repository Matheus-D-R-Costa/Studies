package edu.dio.aulas.collections.map.orderned;

public class Books {

    private String name;
    private Integer pages;

    public Books(String name, Integer pages) {
        this.name = name;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public Integer getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return " Books {" +
                "name = '" + name + '\'' +
                ", pages = " + pages +
                '}';
    }
}
