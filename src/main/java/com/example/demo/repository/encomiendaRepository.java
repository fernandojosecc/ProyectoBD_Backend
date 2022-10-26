package com.example.demo.repository;
import com.example.demo.entity.Encomienda;
import org.springframework.data.jpa.repository.JpaRepository;



import java.io.Serializable;



public interface encomiendaRepository extends JpaRepository<Encomienda, Serializable> {
}
