package Projects.AccessControlSystem.model;

public class User {
    private String user;
    private String senha;
    Integer id;
    public User (String user, String senha, Integer id) {
        this.user = user;
        this.senha = senha;
        this.id = id;
    }
    public String getUser() {return user;}
    public String getSenha() {return senha;}
    public Integer getId() {return id;}
}
