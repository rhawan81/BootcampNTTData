package Hheranca.dominio;

public class Users {
    private String nome;
    private String email;
    private String senha;
    private boolean isAdm;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdm() {
        return isAdm;
    }

    public void setAdm(boolean adm) {
        isAdm = adm;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        System.out.println("Senha alterada com sucesso!");
        this.senha = senha;
    }

    public String getEmail() {
        System.out.println("Email do usuário: " + email);
        return email;
    }

    public void setEmail(String email) {
        System.out.println("Email alterado com sucesso!");
        this.email = email;
    }


    public boolean realizarLogin(String email , String senha){
        if(this.email.equals(email) && this.senha.equals(senha)){
            System.out.println("Login realizado com sucesso");
            return true;
        } else {
            System.out.println("Email ou senha incorretos");
            return false;
        }

    }
    public boolean realizarLogoff(String email , String senha){
        if(this.email.equals(email)){
            System.out.println("Logoff realizado com sucesso");
            return true;
        }
        System.out.println("Email nao encontrado!");

        return false;
    }

    public String alterarSenha(String senha){
        this.senha = senha;
        System.out.println("Senha alterada com sucesso");
        return senha;
    }

    public String alterarDados(String nome, String email , String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        System.out.println("Dados alterados com sucesso");
        return "Nome: " + this.nome + " Email: " + this.email;

    }




}
