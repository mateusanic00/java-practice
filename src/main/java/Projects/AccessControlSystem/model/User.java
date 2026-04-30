package Projects.AccessControlSystem.model;

import java.util.List;

public class User {
    private String user;
    private String senha;
    private Integer id;
    private List<Role> roles;

    public User (String user, String senha, Integer id, List<Role> roles) {
        this.user = user;
        this.senha = senha;
        this.id = id;
        this.roles = roles;
    }
    public String getUser() {return user;}
    public String getSenha() {return senha;}
    public Integer getId() {return id;}
    public List<Role> getRoles() {return roles;}
}
