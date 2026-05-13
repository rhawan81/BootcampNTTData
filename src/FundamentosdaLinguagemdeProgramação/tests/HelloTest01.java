package FundamentosdaLinguagemdeProgramação.tests;

import FundamentosdaLinguagemdeProgramação.dominio.Hello;

public class HelloTest01 {
    public static void main(String[] args) {
        Hello michel = new Hello();
        michel.nome = "MICHEL";
        michel.anoNascimento = 2004;


        michel.exibir();


    }
}
