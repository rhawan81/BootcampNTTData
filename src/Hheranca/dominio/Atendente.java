package Hheranca.dominio;

public class Atendente extends Users{

    private double valorEmCaixa;



    public double getValorEmCaixa(){
        return this.valorEmCaixa;
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

    public double receberPagamento(double valor){

        this.valorEmCaixa += valor;
        return valor;
    }

    public double fecharCaixa(){
        System.out.println("Valor total em caixa: " + this.valorEmCaixa);
        this.valorEmCaixa = 0;
        return this.valorEmCaixa;
    }















}
