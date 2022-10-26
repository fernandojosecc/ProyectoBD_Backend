package com.example.demo.repository;
import com.example.demo.entity.ruta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Repository("rutaRepository")
public interface rutaRepository extends JpaRepository<ruta, Serializable>{
}