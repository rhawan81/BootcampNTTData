package Exercicios.Pet.dominio;

public class Pet {

    private final String nome;
    private boolean clean;


    public String getNome() {
        return nome;
    }

    public boolean isClean() {
        return clean;
    }

    public void setClean(boolean clean) {
        this.clean = clean;
    }

    public Pet(String nome) {
        this.nome = nome;
        this.clean = false;
    }
}
