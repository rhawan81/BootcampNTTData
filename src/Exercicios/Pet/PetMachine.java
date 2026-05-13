package Exercicios.Pet;

import Exercicios.Pet.dominio.Pet;

import java.util.Scanner;

public class PetMachine {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();
    public static void main(String[] args){
        var opcao = -1;


        do {
            System.out.println("Escolha uma das opções:");
            System.out.println("==============");
            System.out.println("1 - dar banho um pet");
            System.out.println("2 - abastecer a maquina com agua");
            System.out.println("3 - Abastecer a maquina com shampoo ");
            System.out.println("4 - Verificar a agua da maquina ");
            System.out.println("5 - verificar shampoo da maquina");
            System.out.println("6 - Verificar se tem pet no banho ");
            System.out.println("7 - colocar pet na maquina ");
            System.out.println("8 - retirar pet da maquina ");
            System.out.println("9 - Limpar Maquina");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao){
                case 7 -> setPetInPetMachine();
            }
        }while(opcao != 0);
    }

    public static void setPetInPetMachine(){
        System.out.println("Digite o nome do pet:");
        var nome = scanner.next();
        var pet = new Pet(nome);
        petMachine.setPet(pet);
    }


}
