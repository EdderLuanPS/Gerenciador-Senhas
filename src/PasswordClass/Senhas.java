package PasswordClass;

public class Senhas {

    private String nomePlataforma;
    private String senhaPlataforma;

    public Senhas(String nomePlataforma, String senha) {
        this.nomePlataforma = nomePlataforma;
        this.senhaPlataforma = senha;
    }

    public String getSenha() {
        return senhaPlataforma;
    }

    public void setSenha(String senha) {
        this.senhaPlataforma = senha;
    }

    public String getNomePlataforma() {
        return nomePlataforma;
    }

    public void setNomePlataforma(String nomePlataforma) {
        this.nomePlataforma = nomePlataforma;
    }

    public Senhas() {
    }

}
