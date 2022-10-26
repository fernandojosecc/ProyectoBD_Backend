package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tipo_viaje")

public class tipoViaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "id_tipo_viaje")
    private int idTipoViaje;

    @Column(name = "tipo")
    private String tipo;

    public int getIdTipoViaje() {
        return idTipoViaje;
    }

    public void setIdTipoViaje(int idTipoViaje) {
        this.idTipoViaje = idTipoViaje;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
