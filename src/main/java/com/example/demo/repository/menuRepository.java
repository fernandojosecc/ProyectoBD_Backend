package com.example.demo.repository;

import com.example.demo.entity.menu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Repository("menuRepository")
public interface menuRepository extends JpaRepository<menu, Serializable> {
}
