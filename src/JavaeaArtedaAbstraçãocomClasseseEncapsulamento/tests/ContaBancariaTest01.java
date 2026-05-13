package JavaeaArtedaAbstraçãocomClasseseEncapsulamento.tests;

import JavaeaArtedaAbstraçãocomClasseseEncapsulamento.dominio.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest01 {
    public static void main(String[] args){
        ContaBancaria conta1 = new ContaBancaria("Michel","14290672418", 500);
        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Consultar cheque especial");
            System.out.println("3. Depositar Dinheiro");
            System.out.println("4. Sacar Dinheiro");
            System.out.println("5. Pagar Boleto");
            System.out.println("6. Verificar se a Conta usa Cheque Especial");
            System.out.println("7. Sair");

            int opcao = scanner.nextInt();
            switch (opcao){
                case 1:
                    conta1.consultarSaldo();
                    break;
                case 2:
                    conta1.verificarChequeEspecial();
                    break;
                case 3:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = scanner.nextDouble();
                    System.out.println("Valor depositado: " + valorDeposito);
                    conta1.depositar(valorDeposito);
                    break;

                case 4:
                    double valorSaque = scanner.nextDouble();
                    conta1.sacar(valorSaque);
                    System.out.println("Valor sacado: " + valorSaque);
                    break;
                case 5:
                    System.out.println("Digite o valor do boleto: ");
                    double valorBoleto = scanner.nextDouble();
                    conta1.pagarBoleto(valorBoleto);
                    System.out.println("Valor do boleto: " + valorBoleto);
                    break;
                case 6:
                    conta1.verificarChequeEspecial();
                    break;
                case 7:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }


        }
    }
}
