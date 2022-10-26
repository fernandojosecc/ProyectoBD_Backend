package com.example.demo.repository;
import com.example.demo.entity.tipoMarca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Repository("tipoMarcaRepository")
public interface tipoMarcaRepository extends JpaRepository<tipoMarca, Serializable>{
}
