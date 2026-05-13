package FundamentosdaLinguagemdeProgramação.dominio;

public class Hello {
    public String nome;
    public int anoNascimento;
    private int anoAtual = 2026;



    public void exibir(){
        System.out.println("Meu nome é :"+ this.nome);
        System.out.println("Minha idade é: " + (this.anoAtual - this.anoNascimento) + " anos");
    }

    public void retonarDiferenca(int valor1, int valor2){
        System.out.println("A diferença é de " + (valor1 - valor2) + " anos");

    }


}
