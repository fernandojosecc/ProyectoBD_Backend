package com.example.demo.repository;
import com.example.demo.entity.tipoPlaca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Repository("tipoPlacaRepository")
public interface tipoPlacaRepository extends JpaRepository<tipoPlaca, Serializable>{
}
