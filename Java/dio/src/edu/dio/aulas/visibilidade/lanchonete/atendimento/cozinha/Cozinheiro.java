package edu.dio.aulas.visibilidade.lanchonete.atendimento.cozinha;

public class Cozinheiro {

    Almoxarife almoxarife = new Almoxarife();
    public void adicionarComboNoBalcao() {
        prepararCombo();
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararCombo() {
        prepararLanche();
        prepararVitamina();
    }

    private void prepararLanche() {
        fritarIngredientesLanche();
        System.out.println("PREPARANDO LANCHE TIPO HAMBÚRGUER");
    }

    private void fritarIngredientesLanche() {
        pedirParaTrocarGas();
        selecionarIngredientesLanche();
        System.out.println("FRITANDO A CARNE E OVO PARA O HAMBÚRGUER");
    }

    private void pedirParaTrocarGas() {
        almoxarife.trocarGas();
    }

    private void selecionarIngredientesLanche() {
        System.out.println("SELECIONADO O PÃO, SALADA, OVO E CARNE");
    }

    private void prepararVitamina() {
        baterVitaminaLiquidificador();
        System.out.println("PREPARANDO SUCO");
    }

    private void baterVitaminaLiquidificador() {
        pedirIngredientes();
        selecionarIngredientesVitamina();
        lavarIngredientes();
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }

    private void pedirIngredientes() {
        almoxarife.entregarIngredientes();
    }

    private void selecionarIngredientesVitamina() {
        System.out.println("SELECIONADO FRUTA, LEITE E SUCO");
    }

    private void lavarIngredientes() {
        System.out.println("LAVANDO INGREDIENTES");
    }

    public void adicionarLancheNoBalcao() {
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBÚRGUER NO BALCÃO");
    }

    public void adicionarSucoNoBalcao() {
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
}
