package Exercicios.Pet;

import Exercicios.Pet.dominio.Pet;

import java.util.Scanner;

public class PetMachine {
    private final static Scanner scanner = new Scanner(System.in);
    private final static PetMachine petMachine = new PetMachine();

    // Atributos da máquina
    private Pet petEmMaquina;
    private double agua;
    private double shampoo;

    // Construtor
    public PetMachine() {
        this.agua = 0;
        this.shampoo = 0;
        this.petEmMaquina = null;
    }

    public static void main(String[] args){
        var opcao = -1;

        do {
            System.out.println("\nEscolha uma das opções:");
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
                case 1 -> darBanho();
                case 2 -> abasteceAgua();
                case 3 -> abasteceShampoo();
                case 4 -> verificarAgua();
                case 5 -> verificarShampoo();
                case 6 -> verificarPet();
                case 7 -> setPetInPetMachine();
                case 8 -> retirarPet();
                case 9 -> limparMaquina();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        }while(opcao != 0);

        scanner.close();
    }

    public static void setPetInPetMachine(){
        System.out.println("Digite o nome do pet:");
        var nome = scanner.next();
        var pet = new Pet(nome);
        petMachine.setPet(pet);
    }

    public void setPet(Pet pet) {
        this.petEmMaquina = pet;
        System.out.println("✓ Pet '" + pet.getNome() + "' colocado na máquina!");
    }

    public static void darBanho() {
        if (petMachine.petEmMaquina == null) {
            System.out.println("✗ Nenhum pet na máquina!");
            return;
        }

        if (petMachine.agua < 10) {
            System.out.println("✗ Água insuficiente! Mínimo: 10L");
            return;
        }

        if (petMachine.shampoo < 5) {
            System.out.println("✗ Shampoo insuficiente! Mínimo: 5L");
            return;
        }

        petMachine.agua -= 10;
        petMachine.shampoo -= 5;
        petMachine.petEmMaquina.setClean(true);

        System.out.println("✓ " + petMachine.petEmMaquina.getNome() + " recebeu banho!");
        System.out.println("  Água restante: " + petMachine.agua + "L");
        System.out.println("  Shampoo restante: " + petMachine.shampoo + "L");
    }

    public static void abasteceAgua() {
        System.out.println("Quantos litros de água deseja adicionar?");
        double litros = scanner.nextDouble();

        if (litros <= 0) {
            System.out.println("✗ Digite uma quantidade válida!");
            return;
        }

        petMachine.agua += litros;
        System.out.println("✓ " + litros + "L de água adicionados!");
        System.out.println("  Água total: " + petMachine.agua + "L");
    }

    public static void abasteceShampoo() {
        System.out.println("Quantos litros de shampoo deseja adicionar?");
        double litros = scanner.nextDouble();

        if (litros <= 0) {
            System.out.println("✗ Digite uma quantidade válida!");
            return;
        }

        petMachine.shampoo += litros;
        System.out.println("✓ " + litros + "L de shampoo adicionados!");
        System.out.println("  Shampoo total: " + petMachine.shampoo + "L");
    }

    public static void verificarAgua() {
        System.out.println("━━━━━━━━━━━━━━━━━━━");
        System.out.println("Água disponível: " + petMachine.agua + "L");
        System.out.println("━━━━━━━━━━━━━━━━━━━");
    }

    public static void verificarShampoo() {
        System.out.println("━━━━━━━━━━━━━━━━━━━");
        System.out.println("Shampoo disponível: " + petMachine.shampoo + "L");
        System.out.println("━━━━━━━━━━━━━━━━━━━");
    }

    public static void verificarPet() {
        System.out.println("━━━━━━━━━━━━━━━━━━━");
        if (petMachine.petEmMaquina == null) {
            System.out.println("Nenhum pet na máquina!");
        } else {
            System.out.println("Pet: " + petMachine.petEmMaquina.getNome());
            System.out.println("Limpo: " + (petMachine.petEmMaquina.isClean() ? "SIM ✓" : "NÃO ✗"));
        }
        System.out.println("━━━━━━━━━━━━━━━━━━━");
    }

    public static void retirarPet() {
        if (petMachine.petEmMaquina == null) {
            System.out.println("✗ Nenhum pet na máquina!");
            return;
        }

        System.out.println("✓ " + petMachine.petEmMaquina.getNome() + " foi retirado da máquina!");
        petMachine.petEmMaquina = null;
    }

    public static void limparMaquina() {
        petMachine.agua = 0;
        petMachine.shampoo = 0;
        petMachine.petEmMaquina = null;
        System.out.println("✓ Máquina limpa e reiniciada!");
    }
}
