package Hheranca.dominio;

public class Manager extends Empregado {

    private String login;
    private String password;
    private double comission;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getComission() {
        return comission;
    }

    public void setComission(double comission) {
        this.comission = comission;
    }

    @Override
    public void exibir(){
        super.exibir();
        System.out.println("Login: " + this.login);
        System.out.println("Password: " + this.password);
        System.out.println("Comissão: " + this.comission);
    }



}
