package com.example.demo.repository;


import com.example.demo.entity.rolUsuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository("rolUsuarioRepository")
public interface rolUsuarioRepository extends JpaRepository<rolUsuario, Serializable> {
}
