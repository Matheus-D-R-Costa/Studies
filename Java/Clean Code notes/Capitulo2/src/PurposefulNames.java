import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PurposefulNames {

    // CÓDIGO IMPLÍCITO - SEM CONTEXTO//
    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<int[]>();
        for (int[] x : theList) // O que tem dentro de theList?
            if (x[0] == 4) // Qual a importância de um item na posição zero? // Qual a importância do valor 4?
                list1.add(x);
        return list1; // Como eu usaria a lista retornada?
    }

    // CÓDIGO EXPLÍCITO - COM CONTEXTO //
    public List<int[]> getFlaggedCells() {
        List<int[]> flaggedCells = new ArrayList<int[]>();
        for (int[] cell : gameBorad)
            if (cell [STATUS_VALUE] == FLAGGED)
                flaggedCells.add(cell);
        return flaggedCells;
    }
}

// cuidado com nomes parecidos.
// usar nomes pronunciáveis. Evite códigos abaixo:
class DtaRcrd102 {
    private Date genymdhms; // o que significa genymdhms?????????
    private Date monymdhms; //o que significa monymdhms?????????
    private final String recordId = "102";
}

// dar preferência a códigos como esse abaixo...
class Customer {
    private Date generationTimestamp;
    private Date modificationTimestamp;
    private final String recordId = "102";
}

// usar nomes pequenos apenas em variáveis locais de métodos pequenos.
// https://docs.oracle.com/javaee/6/tutorial/doc/docinfo.html
// nomes de métodos são verbos.