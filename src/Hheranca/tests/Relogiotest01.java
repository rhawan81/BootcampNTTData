package Hheranca.tests;

import Hheranca.dominio.Relogio;
import Hheranca.dominio.RelogioAmericano;
import Hheranca.dominio.RelogioBrasileiro;

public class Relogiotest01 {
    public static void main(String [] args){
        RelogioBrasileiro relogio = new RelogioBrasileiro();
        relogio.setHoras(15);
        relogio.setMinutos(45);
        relogio.setSegundos(30);



        RelogioAmericano relogioAmericano = new RelogioAmericano();
        relogioAmericano.sincronizar(relogio);


        System.out.println("Relógio Brasileiro: " + relogio.retornarHorario());
        System.out.println("Relógio Americano: " + relogioAmericano.retornarHorario());


















    }








}
