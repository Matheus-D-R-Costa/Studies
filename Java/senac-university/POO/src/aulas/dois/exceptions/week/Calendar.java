package aulas.dois.exceptions.week;

public class Calendar {

    private Calendar() {}

    private final static String[] DAYS = {"Segunda", "Terça", "Quarta", "Quinta", "Sexta", "Sábado", "Domingo"};

    public static String getDay(int day) {

        try {
            if (day == 0) throw new IllegalArgumentException();
            return DAYS[day - 1];
        } catch (IllegalArgumentException ex) {
            return "Entrada inválida!";
        }

    }

}
