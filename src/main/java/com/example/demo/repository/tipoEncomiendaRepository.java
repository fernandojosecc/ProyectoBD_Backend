package com.example.demo.repository;
import com.example.demo.entity.tipoEncomienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Repository("tipoEncomiendaRepository")
public interface tipoEncomiendaRepository extends JpaRepository<tipoEncomienda, Serializable>{
}
