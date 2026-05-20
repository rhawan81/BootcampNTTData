package Hheranca.dominio;

public class Gerente extends Users{

    public Gerente(){
        setAdm(true);
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



    public void gerarRelatorioFinanceiro(Vendedor vendedor , Atendente atendente){

        System.out.println("====== Relatório Financeiro ========");
        System.out.println("Vendas realizadas pelo vendedor: " + vendedor.consultarVendas());
        System.out.println("Valor total em caixa do atendente: " + atendente.getValorEmCaixa());

        System.out.println("Relatório gerado com sucesso!");


    }
    public  void consultarVendas(Vendedor vendedor , Atendente atendente){
        System.out.println("Gerente consultando vendas...");
        System.out.println("Vendas realizadas: " + vendedor.consultarVendas());
        System.out.println("Vendas em caixa do  atendente : " + atendente.getValorEmCaixa());
    }




}
