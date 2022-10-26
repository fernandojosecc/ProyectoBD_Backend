package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_marca")
public class tipoMarca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "id_marca")
    private int idMarca;

    @Column(name = "marca")
    private int marca;

    @OneToMany(mappedBy = "idMarca")
    private List<bus>busList;

    public int getIdMarca() {
        return idMarca;
    }

    public void setIdMarca(int idMarca) {
        this.idMarca = idMarca;
    }

    public int getMarca() {
        return marca;
    }

    public void setMarca(int marca) {
        this.marca = marca;
    }

    public List<bus> getBusList() {
        return busList;
    }

    public void setBusList(List<bus> busList) {
        this.busList = busList;
    }
}
