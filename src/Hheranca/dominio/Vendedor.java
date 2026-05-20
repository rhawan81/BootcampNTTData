package Hheranca.dominio;

public class Vendedor  extends Users{
    private int qntdVendas;


    public int realizarVendas(){

        this.qntdVendas += 1;

        return qntdVendas;
    }


    public int consultarVendas(){

        return qntdVendas;

    }
    public int getQntdVendas() {
        return qntdVendas;
    }

    public void setQntdVendas(int qntdVendas) {
        this.qntdVendas = qntdVendas;
    }


    public boolean realizarLogin(String email , String senha){
         super.realizarLogin(email, senha);
        return true;
    }

    public boolean realizarLogoff(String email , String senha){
         super.realizarLogoff(email, senha);

        return true;

    }

    public String alterarSenha(String senha){
        super.alterarSenha(senha);
        return "Senha alterada com sucesso!";
    }

    public String alterarDados(String nome, String email , String senha){
        super.alterarDados(nome, email, senha);
        return "Dados alterados com sucesso!";
    }




}
