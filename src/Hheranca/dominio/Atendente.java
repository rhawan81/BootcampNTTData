package Hheranca.dominio;

public class Atendente extends Users{

    private int valorEmCaixa;



    public int getValorEmCaixa(){
        return this.valorEmCaixa;
    }


    public boolean realizarLogin(String email , String senha){
        return super.realizarLogin(email, senha);
    }

    public boolean realizarLogoff(String email , String senha){
        return super.realizarLogoff(email, senha);

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
