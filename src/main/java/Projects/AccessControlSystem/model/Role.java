package Projects.AccessControlSystem.model;

import java.util.List;

public class Role {
    private Integer id;
    private String nome;
    private List<Permission> permissionList;

    public Role (Integer id, String nome, List<Permission> permissionList) {
        this.id = id;
        this.nome = nome;
        this.permissionList = permissionList;
    }

    public Integer getId() {return id;}
    public String getNome() {return nome;}
    public List<Permission> getPermissionList() {return permissionList;}
}
