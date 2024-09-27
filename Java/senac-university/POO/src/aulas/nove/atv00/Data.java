package aulas.nove.atv00;

public class Data {

    private int day;
    private int month;
    private int year;

    public Data(int day, int month) {
        this.day = validateDay(day);
        this.month = validateMonth(month);
    }

    public Data(int day, int month, int year) {
        this.day = validateDay(day);
        this.month = validateMonth(month);
        this.year = year;
    }

    private int validateDay(int day) {
        if (day > 31 ) throw new IllegalArgumentException("Dia inválido!");
        return day;
    }

    private int validateMonth(int month) {
        if (month > 12) throw new IllegalArgumentException("Mês Inválido!");
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
