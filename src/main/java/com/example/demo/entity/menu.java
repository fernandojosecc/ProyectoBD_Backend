package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "menu")

public class menu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "id_menu")
    private int idMenu;

    @Column(name = "opcion_menu")
    private int opcionMenu;

    @Column(name = "pagina")
    private String pagina;

    @OneToMany(mappedBy = "idMenu")
    private List<rolUsuarioMenu>rolUsuarioMenuList;

    public int getIdMenu() {
        return idMenu;
    }

    public void setIdMenu(int idMenu) {
        this.idMenu = idMenu;
    }

    public int getOpcionMenu() {
        return opcionMenu;
    }

    public void setOpcionMenu(int opcionMenu) {
        this.opcionMenu = opcionMenu;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public List<rolUsuarioMenu> getRolUsuarioMenuList() {
        return rolUsuarioMenuList;
    }

    public void setRolUsuarioMenuList(List<rolUsuarioMenu> rolUsuarioMenuList) {
        this.rolUsuarioMenuList = rolUsuarioMenuList;
    }
}
