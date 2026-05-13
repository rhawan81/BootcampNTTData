package JavaeaArtedaAbstraçãocomClasseseEncapsulamento.dominio;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private  double saldo;
    private double chequeEspecial;
    private boolean usandoChequeEspecial;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isUsandoChequeEspecial() {
        return usandoChequeEspecial;
    }

    public void setUsandoChequeEspecial(boolean usandoChequeEspecial) {
        this.usandoChequeEspecial = usandoChequeEspecial;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldo() {
        System.out.println("Seu saldo é de : " + this.saldo);
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void depositar(double valor){
        this.saldo += valor;
        System.out.println("Voce depositou o valor de : " + valor);
    }

    public void sacar(double valor){
        if(valor > this.saldo + this.chequeEspecial){
            System.out.println("Saque bloqueado");
        } else if (valor > this.saldo && valor <= this.saldo + this.chequeEspecial) {
            System.out.println("Voce esta utilizando o cheque especial");
            this.usandoChequeEspecial = true;
            this.saldo -= valor;
            System.out.println("Voce sacou o valor de : " + valor);

        } else{
            this.saldo -= valor;
            System.out.println("Voce sacou o valor de : " + valor);
        }
    }

    public void consultarSaldo(){
        System.out.println("Saldo atual: " + this.saldo);

    }
    public void pagarBoleto(double valor){
        if (this.saldo >= valor){
            this.saldo -= valor;
            System.out.println("Boleto pago com sucesso!");
        } else if (this.saldo + this.chequeEspecial >= valor) {
            System.out.println("Voce esta utilizando o cheque especial para pagar o boleto");
            this.usandoChequeEspecial = true;
            this.saldo -= valor;
            System.out.println("Boleto pago com sucesso!");

        } else{
            System.out.println("Saldo insuficiente para pagar o boleto");
        }
    }


    public void verificarChequeEspecial(){
        double valorUsado = this.saldo * - 1;
        if (this.usandoChequeEspecial){
            double taxa = (valorUsado * 0.20);
            this.saldo -= taxa;
            System.out.println("Voce esta utilizando o cheque especial, valor utilizado: " + valorUsado);
            System.out.println("Taxa de juros aplicada: " + taxa);

        } else{
            System.out.println("Voce nao esta utilizando o cheque especial");
        }
    }

    public ContaBancaria(String nome, String cpf, double saldo) {
        this.cpf = cpf;
        this.nome = nome;
        this.saldo = saldo;
        
        if(this.saldo <= 500){
            this.chequeEspecial = 50.00;
            System.out.println();
            
        } else{
            this.chequeEspecial = (saldo * 0.50);
            
        }

    }
}
