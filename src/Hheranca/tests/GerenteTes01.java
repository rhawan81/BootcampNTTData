package Hheranca.tests;

import Hheranca.dominio.Atendente;
import Hheranca.dominio.Gerente;
import Hheranca.dominio.Vendedor;

public class GerenteTes01 {
    public static void main(String[]args){
        Gerente gerente = new Gerente();
        Vendedor vendedor = new Vendedor();
        Atendente atendente = new Atendente();
       vendedor.setNome("João");
       vendedor.setEmail("rhawan@gmail.com");
       vendedor.setSenha("1");
       vendedor.realizarLogin("rhawan@gmail.com","1");
        vendedor.realizarVendas();
        vendedor.realizarVendas();
        vendedor.realizarVendas();

        atendente.receberPagamento(150);
        atendente.receberPagamento(200);



        gerente.gerarRelatorioFinanceiro(vendedor, atendente);
        gerente.consultarVendas(vendedor, atendente);




    }
}
