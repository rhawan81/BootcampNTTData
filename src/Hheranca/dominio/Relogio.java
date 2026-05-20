package Hheranca.dominio;

public abstract class Relogio {

    private int horas;
    private int minutos;
    private int segundos;


    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {

        if(segundos >= 0 && segundos <= 59){
            this.segundos = segundos;
        }
        else{
            System.out.println("Segundo invalido !");
        }

    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        if(minutos >= 0 && minutos <= 59){
            this.minutos = minutos;
        }
        else{
            System.out.println("Minuto invalido !");
        }
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        if(horas >= 0 && horas <= 23){
            this.horas = horas;
        }
        else{
            System.out.println("Hora invalida !");
        }
    }

    public String retornarHorario(){
      return String.format("%02d:%02d:%02d", this.horas, this.minutos, this.segundos);
    }


    public abstract void sincronizar(Relogio relogio);















}
