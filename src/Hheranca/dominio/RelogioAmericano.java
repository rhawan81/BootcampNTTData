package Hheranca.dominio;

public class RelogioAmericano extends Relogio{
    @Override
    public void sincronizar(Relogio relogio) {

        if (relogio.getHoras() > 12) {
            this.setHoras(relogio.getHoras() - 12);
        } else {
            this.setHoras(relogio.getHoras());
        }
        this.setMinutos(relogio.getMinutos());
        this.setSegundos(relogio.getSegundos());

    }
}
