package Hheranca.dominio;

public class Ingresso {
    protected double valor;
    private String nomeDoFilme;
    private boolean dublado;

    public double getValor() {
        return valor;
    }

    public double calculaValor(){
        return this.valor;
    }


    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public boolean getDublado() {
        return dublado;
    }

    public void setDublado(boolean dublado) {
        this.dublado = dublado;
    }

    public void exibirDados(){
        System.out.println("Valor do ingresso: " + calculaValor());
        System.out.println("Nome do filme: " + this.nomeDoFilme);
        System.out.println("Dublado: " + this.dublado);
    }




}
