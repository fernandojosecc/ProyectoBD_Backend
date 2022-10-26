package com.example.demo.repository;
import com.example.demo.entity.tiempoViaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Repository("tiempoViajeRepository")
public interface tiempoViajeRepository extends JpaRepository<tiempoViaje, Serializable>{
}
