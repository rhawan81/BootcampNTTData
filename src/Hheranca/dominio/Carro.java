package Hheranca.dominio;

public class Carro {
    private String nome;
    private String modelo;
    private int ano;


    public Carro(String nome, int ano, String modelo) {
        this.nome = nome;
        this.ano = ano;
        this.modelo = modelo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Ano: " + this.ano);
        System.out.println("Modelo: " + this.modelo);
    }

}
