package Hheranca.tests;

import Hheranca.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro[] carro = new Carro[5];
        Carro[] carro2 = new Carro[2];
        carro2[0] = new Carro("BMW", 2002,"Esportivo");
        Carro carroEspecial = carro2[0];

        carro2[0].setNome("Mercedes-Benz");
        System.out.println(carroEspecial.getNome());


        carro[0] = new Carro("Fusca",2000,"Sport");
        carro[1] = new Carro("Gol",2020,"automatico");
        carro[2] = new Carro("Celta",2010,"4x4");
        carro[3] = new Carro("Uno",2015,"Casual");
        carro[4] = new Carro("Polo",2022,"Sport");

        for (int i = 0; i <carro.length ; i++) {
            System.out.println("-------------------------");

               carro[i].imprime();


        }

















    }














}
