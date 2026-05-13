package FundamentosdaLinguagemdeProgramação.tests;

import FundamentosdaLinguagemdeProgramação.dominio.Hello;

public class HelloTest01 {
    public static void main(String[] args) {
        Hello michel = new Hello();
        Hello jose = new Hello();
        michel.nome = "MICHEL";
        michel.anoNascimento = 2004;
        jose.nome = "Jose";
        jose.anoNascimento = 2006;
        michel.exibir();
        michel.retonarDiferenca(jose.anoNascimento, michel.anoNascimento);


    }
}
