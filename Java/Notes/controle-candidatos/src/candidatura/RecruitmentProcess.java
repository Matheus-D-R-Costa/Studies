package candidatura;

public class RecruitmentProcess {
    public static void main(String[] args) {
        String [] names = {"FELIPE","MÁRCIA","JULIA","PAULO","AUGUSTO","MÔNICA","FABRÍCIO","MIRELA","DANIELA","JORGE"};

        Candidate [] candidates = new Candidate[names.length];

        for (int index = 0; index < names.length; index++) {
            candidates[index] = new Candidate(names[index]);
        }

        for (Candidate candidate : candidates) {
            System.out.println(STR."O candidato \{candidate.getName()} deseja ter um salário de \{candidate.desiredSalary()}");
        }
    }
}
