package com.example.demo.entity;


import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "usuario")
public class User implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "contrasenia")
    private String contrasenia;

    @OneToMany(mappedBy = "idUsuario")
    private List<rolUsuario>rolUsuarioList;

    @OneToMany(mappedBy = "idUsuario")
    private List<rolUsuarioMenu>rolUsuarioMenuList;

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public List<rolUsuario> getRolUsuarioList() {
        return rolUsuarioList;
    }

    public void setRolUsuarioList(List<rolUsuario> rolUsuarioList) {
        this.rolUsuarioList = rolUsuarioList;
    }

    public List<rolUsuarioMenu> getRolUsuarioMenuList() {
        return rolUsuarioMenuList;
    }

    public void setRolUsuarioMenuList(List<rolUsuarioMenu> rolUsuarioMenuList) {
        this.rolUsuarioMenuList = rolUsuarioMenuList;
    }
}
