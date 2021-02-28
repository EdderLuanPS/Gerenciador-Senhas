package UserClass;

public class Usuario {

    private String loginUsuario;
    private String senhaUsuario;

    public Usuario(String loginUsuario, String senhaUsuario) {
        this.loginUsuario = loginUsuario;
        this.senhaUsuario = senhaUsuario;
    }

    public String getSenhaUsuario() {
        return senhaUsuario;
    }

    public void setSenhaUsuario(String senhaUsuario) {
        this.senhaUsuario = senhaUsuario;
    }

    public String getLoginUsuario() {
        return loginUsuario;
    }

    public void setLoginUsuario(String loginUsuario) {
        this.loginUsuario = loginUsuario;
    }

    public static void Usuario() {

    }

}
