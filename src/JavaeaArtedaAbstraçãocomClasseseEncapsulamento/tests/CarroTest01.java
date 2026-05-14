package JavaeaArtedaAbstraçãocomClasseseEncapsulamento.tests;

import JavaeaArtedaAbstraçãocomClasseseEncapsulamento.dominio.Carro;

import java.util.Scanner;

public class CarroTest01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro("Ford", "Ka", "2009");


        while (true) {
            System.out.println("1. Ligar o carro");
            System.out.println("2. Desligar o carro");
            System.out.println("3. Acelerar o carro");
            System.out.println("4. Diminuir velocidade");
            System.out.println("5. Virar");
            System.out.println("6. Verificar velocidade");
            System.out.println("7. Trocar Marcha");
            System.out.println("8. Sair");


            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    carro.ligarCarro();
                    break;
                case 2:
                    carro.desligarCarro();
                    break;
                case 3:
                    carro.acelerar();
                    break;
                case 4:
                    carro.diminuirVelocidade();
                    break;
                case 5:
                    System.out.println("Digite a direção para virar (esquerda/direita): ");
                    String direcao = scanner.next();
                    carro.virar(direcao);
                    break;
                case 6:
                    carro.verificarVelocidade();
                    break;
                case 7:
                    System.out.println("Digite a marcha para trocar (1, 2, 3, 4, 5): ");
                    int marcha = scanner.nextInt();
                    carro.trocarMarcha(marcha);
                    break;
                case 8:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }


        }
    }
}
