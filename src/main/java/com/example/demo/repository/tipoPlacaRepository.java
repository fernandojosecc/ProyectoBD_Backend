package com.example.demo.repository;
import com.example.demo.entity.TipoPlaca;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository("tipoPlacaRepository")
public interface tipoPlacaRepository extends JpaRepository<TipoPlaca, Serializable>{
}
