package Hheranca.dominio;

public class IngressoMeiaEntrada  extends Ingresso{

    @Override
    public double calculaValor(){
        super.calculaValor();
        return this.valor/2;
    }
    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Valor do Ingresso: " + this.calculaValor());


    }


}
