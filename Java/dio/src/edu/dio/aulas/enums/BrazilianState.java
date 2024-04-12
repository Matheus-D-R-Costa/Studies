package edu.dio.aulas.enums;

public enum BrazilianState {
    SAO_PAULO("SP", "São Paulo"),
    RIO_DE_JANEIRO("RJ", "Rio de Janeiro"),
    MINAS_GERAIS("MG", "Minas Gerais")
    ;

    private final String sigla;
    private final String name;

    BrazilianState(String sigla, String name) {
        this.sigla = sigla;
        this.name = name;
    }

    public String getSigla() {
        return sigla;
    }

    public String getName() {
        return name;
    }
}
