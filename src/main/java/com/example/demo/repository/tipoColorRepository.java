package com.example.demo.repository;
import com.example.demo.entity.tipoColor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Repository("tipoColorRepository")
public interface tipoColorRepository extends JpaRepository<tipoColor, Serializable>{
}
