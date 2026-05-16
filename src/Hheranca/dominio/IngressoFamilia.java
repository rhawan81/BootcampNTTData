package Hheranca.dominio;

public class IngressoFamilia  extends Ingresso{
    private int numeroDePessoas;


    public int getNumeroDePessoas() {
        return numeroDePessoas;
    }

    public void setNumeroDePessoas(int numeroDePessoas) {
        this.numeroDePessoas = numeroDePessoas;
    }

    @Override
    public double calculaValor(){
        if(this.numeroDePessoas > 3){
            return this.valor * this.numeroDePessoas * 0.95;
        }

        return this.valor * this.numeroDePessoas;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Valor do Ingresso: " + this.calculaValor());
        System.out.println("Número de Pessoas: " + this.numeroDePessoas);
    }
}
