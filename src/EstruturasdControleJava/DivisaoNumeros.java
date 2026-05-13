package EstruturasdControleJava;

import java.util.Scanner;

public class DivisaoNumeros {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int primeiroNumero = scanner.nextInt();

        int numero;
        while(true){

            System.out.println("Digite o segundo número: ");
            numero = scanner.nextInt();

            if(numero< primeiroNumero){
                System.out.println("Numero Ignorado");
                continue;
            }


            if(numero % primeiroNumero != 0){
                System.out.println("Numero nao é divisivel por "+ primeiroNumero);
                break;
            }

            System.out.println("Numero é divisivel por "+ primeiroNumero);
        }

        System.out.println("Programa Finalizado");
        scanner.close();


















    }
}
