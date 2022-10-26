package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_encomienda")
public class tipoEncomienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "id_tipo_encomienda")
    private int idTipoEncomienda;

    @Column(name = "estado")
    private String estado;

    @OneToMany(mappedBy = "idTipoEncomienda")
    private List<encomienda>encomiendaList;

    public int getIdTipoEncomienda() {
        return idTipoEncomienda;
    }

    public void setIdTipoEncomienda(int idTipoEncomienda) {
        this.idTipoEncomienda = idTipoEncomienda;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public List<encomienda> getEncomiendaList() {
        return encomiendaList;
    }

    public void setEncomiendaList(List<encomienda> encomiendaList) {
        this.encomiendaList = encomiendaList;
    }
}
