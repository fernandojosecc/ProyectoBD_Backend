package com.example.demo.repository;
import com.example.demo.entity.tipoViaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Repository("tipoViajeRepository")
public interface tipoViajeRepository extends JpaRepository<tipoViaje, Serializable>{
}
