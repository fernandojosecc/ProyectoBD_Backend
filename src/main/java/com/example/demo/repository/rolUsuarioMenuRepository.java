package com.example.demo.repository;

import com.example.demo.entity.rolUsuarioMenu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;
@Repository("rolUsuarioMenuRepository")
public interface rolUsuarioMenuRepository extends JpaRepository<rolUsuarioMenu, Serializable> {
}
