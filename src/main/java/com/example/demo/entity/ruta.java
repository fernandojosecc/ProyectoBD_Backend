package com.example.demo.entity;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "ruta")
public class ruta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)

    @Column(name = "id_ruta")
    private int idRuta;

    @Column(name = "tiempo")
    private String tiempo;

    @Column(name = "hora_salida")
    private String horaSalida;

    @Column(name = "hora_llegada")
    private String horaLlegada;

    @Column(name = "id_ruta_origen")
    private int idRutaOrigen;

    @Column(name = "id_ruta_destino")
    private int idRutaDestino;

    @Column(name = "id_tiempo")
    private int idTiempo;

    @OneToMany(mappedBy = "idRuta")
    private List<encomienda>encomiendaList;

    public int getIdRuta() {
        return idRuta;
    }

    public void setIdRuta(int idRuta) {
        this.idRuta = idRuta;
    }

    public String getTiempo() {
        return tiempo;
    }

    public void setTiempo(String tiempo) {
        this.tiempo = tiempo;
    }

    public String getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(String horaSalida) {
        this.horaSalida = horaSalida;
    }

    public String getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(String horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public int getIdRutaOrigen() {
        return idRutaOrigen;
    }

    public void setIdRutaOrigen(int idRutaOrigen) {
        this.idRutaOrigen = idRutaOrigen;
    }

    public int getIdRutaDestino() {
        return idRutaDestino;
    }

    public void setIdRutaDestino(int idRutaDestino) {
        this.idRutaDestino = idRutaDestino;
    }

    public int getIdTiempo() {
        return idTiempo;
    }

    public void setIdTiempo(int idTiempo) {
        this.idTiempo = idTiempo;
    }

    public List<encomienda> getEncomiendaList() {
        return encomiendaList;
    }

    public void setEncomiendaList(List<encomienda> encomiendaList) {
        this.encomiendaList = encomiendaList;
    }
}
