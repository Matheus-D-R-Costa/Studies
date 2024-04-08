package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class CandidatesAnalysis {

    String [] candidates = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};
    double desiredSalary;
    double salaryBase = 2000.0;

    public void selectCandidates() {

        for(String candidate : candidates) {

//            System.out.println("O candidato(a) " + candidate + " quer um salário de " + desiredSalary());
        }

    }
    public void analyzeSalary() {
        if (salaryBase > desiredSalary) {
            System.out.println("Ligar para o candidato");
        } else if (salaryBase == desiredSalary) {
            System.out.println("Ligar para o candidato, com contra proposta");
        } else {
            System.out.println("Aguardando resultado dos demais candidados");
        }
    }

    public double desiredSalary() {
        return ThreadLocalRandom.current().nextDouble(1500, 3000);
    }
}
