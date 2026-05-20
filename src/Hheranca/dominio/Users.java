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
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public boolean realizarLogin(String email , String senha){
        if(this.email.equals(email) && this.senha.equals(senha)){
            return true;
        } else {
            System.out.println("Email ou senha incorretos");
            return false;
        }

    }
    public boolean realizarLogoff(String email , String senha){
        if(this.email.equals(email) && this.senha.equals(senha)){
            System.out.println("Logoff realizado com sucesso");
            return true;
        }

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
