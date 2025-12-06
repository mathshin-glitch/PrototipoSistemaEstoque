package classes;

public class Usuario {

    private int id;
    private String login;
    private String senhaHash;
    private String salt;
    private String cargo; // "ADMINISTRADOR", "OPERADOR", "USUARIO"

    public Usuario() {
    }

    public Usuario(int id, String login, String senhaHash, String salt, String cargo) {
        this.id = id;
        this.login = login;
        this.senhaHash = senhaHash;
        this.salt = salt;
        this.cargo = cargo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenhaHash() {
        return senhaHash;
    }

    public void setSenhaHash(String senhaHash) {
        this.senhaHash = senhaHash;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

}
