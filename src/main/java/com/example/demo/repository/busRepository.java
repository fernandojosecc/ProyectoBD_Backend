package com.example.demo.repository;
import com.example.demo.entity.bus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;

@Repository("busRepository")
public interface busRepository extends JpaRepository<bus, Serializable>{
}
