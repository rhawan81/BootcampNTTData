package Hheranca.tests;

import Hheranca.dominio.Ingresso;
import Hheranca.dominio.IngressoFamilia;
import Hheranca.dominio.IngressoMeiaEntrada;

public class CinemaTest01 {
    public static void main(String[]args){
        Ingresso ingresso = new Ingresso();
        IngressoFamilia ingressoFamilia = new IngressoFamilia();
        ingressoFamilia.setNomeDoFilme("Vingadores");
        ingressoFamilia.setDublado(true);
        ingressoFamilia.setNumeroDePessoas(4);
        ingressoFamilia.setValor(50.0);
        ingressoFamilia.calculaValor();
        ingressoFamilia.exibirDados();
        System.out.println("-------------------------");
        IngressoMeiaEntrada meia = new IngressoMeiaEntrada();
        ingresso.setValor(200.0);
        ingresso.setNomeDoFilme("Vingadores");
        ingresso.setDublado(true);
        ingresso.calculaValor();
        ingresso.exibirDados();
        System.out.println("-------------------------");

        meia.setValor(200.0);
        meia.setNomeDoFilme("Vingadores");
        meia.setDublado(true);
        meia.calculaValor();
        meia.exibirDados();























    }
}
