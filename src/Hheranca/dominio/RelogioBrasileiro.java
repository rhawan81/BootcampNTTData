package Hheranca.dominio;

public class RelogioBrasileiro extends Relogio{
    @Override
    public void sincronizar(Relogio relogio) {
        this.setHoras(relogio.getHoras());
        this.setMinutos(relogio.getMinutos());
        this.setSegundos(relogio.getSegundos());

    }
}
