package JavaeaArtedaAbstraçãocomClasseseEncapsulamento.dominio;

public class Carro {
    private String marca;
    private String modelo;
    private int velocidade = 0;
    private String ano;
    private int numMarchas = 0;
    private boolean carroAtivo = false;



    public Carro(String marca, String modelo, String ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }


    public void ligarCarro(){
        if(this.carroAtivo){
            System.out.println("O carro  ja esta ligado !!");

        }
        else{
            this.carroAtivo = true;
            System.out.println("O carro esta desligado , porem esta ligando agora!!");
        }
    }

    public void desligarCarro(){
        if(this.carroAtivo != true){
            System.out.println("O carro ja esta desligado !!");
        } else if (this.velocidade == 0 && this.numMarchas == 0) {
            this.carroAtivo = false;
            System.out.println("O carro esta ligado , porem esta desligando agora!!");
        }


         else {
            System.out.println("O carro esta em movimento , por favor pare o carro para desligar!!");
        }
    }
    public void acelerar(){
        if(!this.carroAtivo){
                System.out.println("O carro esta desligado por favor ligue o carro para acelerar!!");
        }
        else if(this.velocidade == 0 && this.numMarchas == 0){
            System.out.println("O carro esta em ponto morto por favor engate a marcha para acelerar!!");

        }else{
            if(numMarchas == 1 && this.velocidade >= 20){
                System.out.println("Engatando a primeira marcha!!");
                System.out.println("Voce nao pode mais acelerar passe a segunda marcha");
            } else if (numMarchas == 2 && this.velocidade >= 40) {
                System.out.println("Engatando a segunda marcha!!");
                System.out.println("Voce nao pode mais acelerar passe a terceira marcha");
            } else if (numMarchas == 3 &&this.velocidade >=60) {
                System.out.println("Engatando a terceira marcha!!");
                System.out.println("Voce nao pode mais acelerar passe a quarta marcha");
            } else if (numMarchas == 4 && this.velocidade >= 80) {
                System.out.println("Engatando a quarta marcha!!");
                System.out.println("Voce nao pode mais acelerar passe a quinta marcha");
            } else if (numMarchas == 5 && this.velocidade >= 100) {
                System.out.println("Engatando a quinta marcha!!");
                System.out.println("Voce nao pode mais acelerar passe a sexta marcha");
            } else if (numMarchas == 6 && this.velocidade >= 120) {
                System.out.println("Engatando a sexta marcha!!");
                System.out.println("Voce esta na velocidade maxima!!");
                
            } else {
                this.velocidade += 1;
                System.out.println("Acelerando !!!!");
            }


            

        }
    }
    public void diminuirVelocidade(){
        if(!this.carroAtivo){
           
            System.out.println("O carro esta desligado por favor ligue o carro para diminuir a velocidade!!");
        } else if (this.velocidade == 0) {
            System.out.println("O carro ja esta parado!!");
        } else{
            this.velocidade -= 1;
            System.out.println("Diminuindo a velocidade !!!!");
            
        }
    }

    public void trocarMarcha(int marchas){
        if(!this.carroAtivo){
            System.out.println("Carro esta Desligado");
        } else if (marchas < 0 || marchas > 6) {
            System.out.println("Marcha Invalida!!");
        } else if (marchas - this.numMarchas > 1 || this.numMarchas - marchas > 1){
            System.out.println("Voce so pode trocar uma marcha por vez!!");
        } else if (marchas == 1 && this.velocidade > 20) {
            System.out.println("Velocidade muito alta para a 1a marcha!");
        } else if (marchas == 2 && (this.velocidade < 21 || this.velocidade > 40)) {
            System.out.println("Velocidade incompativel com a 2a marcha!");
        } else if (marchas == 3 && (this.velocidade < 41 || this.velocidade > 60)) {
            System.out.println("Velocidade incompativel com a 3a marcha!");
        } else if (marchas == 4 && (this.velocidade < 61 || this.velocidade > 80)) {
            System.out.println("Velocidade incompativel com a 4a marcha!");
        } else if (marchas == 5 && (this.velocidade < 81 || this.velocidade > 100)) {
            System.out.println("Velocidade incompativel com a 5a marcha!");
        } else if (marchas == 6 && (this.velocidade < 101 || this.velocidade > 120)) {
            System.out.println("Velocidade incompativel com a 6a marcha!");
        } else {
            this.numMarchas = marchas;
            System.out.println("Marcha " + marchas + " engatada!");
        }
    }

     public void statusCarro(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Velocidade: " + this.velocidade + " km/h");
        System.out.println("Marcha: " + this.numMarchas);
        System.out.println("Carro Ativo: " + (this.carroAtivo ? "Sim" : "Não"));
    }

    public void virar(String direcao){
        if(!this.carroAtivo){
            System.out.println("Carro esta Desligado");
        } else if (this.velocidade < 1 || this.velocidade > 40) {
            System.out.println("Velocidade incompativel para virar, deve estar entre 1km e 40km!");
        } else {
            System.out.println("Virando para " + direcao + "!");
        }
    }

    public void verificarVelocidade(){
        System.out.println("Velocidade atual: " + this.velocidade + " km/h | Marcha: " + this.numMarchas);
    }












}
