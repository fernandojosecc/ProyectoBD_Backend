package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_color")
public class tipoColor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "id_color")
    private int idColor;

    @Column(name = "color")
    private int color;

    @OneToMany(mappedBy = "idTipoColor")
    private List<bus>busList;

    public int getIdColor() {
        return idColor;
    }

    public void setIdColor(int idColor) {
        this.idColor = idColor;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public List<bus> getBusList() {
        return busList;
    }

    public void setBusList(List<bus> busList) {
        this.busList = busList;
    }
}
