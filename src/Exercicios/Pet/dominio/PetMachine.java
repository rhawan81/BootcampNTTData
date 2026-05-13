package Exercicios.Pet.dominio;

public class PetMachine {
    private boolean clean;
    private int water;
    private int shampoo;
    private Pet pet;



    public void darBanhoNoPet(){
        if(this.pet == null){
            System.out.println("Não tem pet para dar banho");
            return;
        }
        this.water -= 10;
        this.shampoo -= 2;
        pet.setClean(true);
        System.out.println("O pet " + pet.getNome() + " está limpo");

    }

    public void adicionarAgua(){
        if(water == 30){
            System.out.println("A capacidade da maquina esta no maximo");
            return;
        }

        water += 2;
    }
    public void adicionarShampoo(){
        if(shampoo == 10){
            System.out.println("Shampoo da maquina esta no maximo");
        }

        shampoo += 2;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    public int getShampoo() {
        return shampoo;
    }

    public void setShampoo(int shampoo) {
        this.shampoo = shampoo;
    }


    public boolean hasPet(){
        return pet != null;
    }

    public void setPet(Pet pet) {
        if(!this.clean){
            System.out.println("A maquina esta suja . para colocar pet e necessario limpar - la");
            return;
        }
        if(hasPet()){
            System.out.println("O pet :"+ this.pet.getNome() + " já esta na maquina, retire ele para colocar outro pet");
            return;
        }
        this.pet = pet;
    }
}
