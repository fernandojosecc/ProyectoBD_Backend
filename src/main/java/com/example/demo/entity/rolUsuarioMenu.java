package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "rol_usuario_menu")
public class rolUsuarioMenu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "id_menu")
    private int idMenu;

    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "id_rol")
    private int idRol;


    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }
}
