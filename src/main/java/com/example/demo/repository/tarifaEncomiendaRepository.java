package com.example.demo.repository;
import com.example.demo.entity.tarifaEncomienda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Repository("tarifaEncomiendaRepository")
public interface tarifaEncomiendaRepository extends JpaRepository<tarifaEncomienda, Serializable>{
}
