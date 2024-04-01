public class bulletin {
    public static void main(String[] args) {
        double note = 7;

        double schoolReport = setBulletin(note);

        System.out.println(schoolReport);
    }

    public static double setBulletin(double note) {
        if (note < 6) {
            System.out.println("REPROVADO!");
        } else if (note == 6) {
            System.out.println("RECUPERAÇÃO");
        } else {
            System.out.println("APROVADO");
        }
        return note;
    }
}
