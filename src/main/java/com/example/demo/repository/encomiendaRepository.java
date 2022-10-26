package com.example.demo.repository;
import com.example.demo.entity.encomienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Repository("encomiendaRepository")
public interface encomiendaRepository extends JpaRepository<encomienda, Serializable> {
}
