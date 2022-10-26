package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_placa")
public class tipoPlaca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "id_placa")
    private int idPlaca;

    @Column(name = "tipo")
    private int tipo;

    @Column(name = "descripcion")
    private int descripcion;

    @OneToMany(mappedBy = "idTipoPlaca")
    private List<bus>busList;

    public int getIdPlaca() {
        return idPlaca;
    }

    public void setIdPlaca(int idPlaca) {
        this.idPlaca = idPlaca;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public int getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(int descripcion) {
        this.descripcion = descripcion;
    }

    public List<bus> getBusList() {
        return busList;
    }

    public void setBusList(List<bus> busList) {
        this.busList = busList;
    }
}
