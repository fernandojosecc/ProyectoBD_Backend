package com.example.demo.repository;

import com.example.demo.entity.login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;
import java.io.Serializable;
import java.util.List;


@Repository("loginRepository")
public interface loginRepository extends JpaRepository<login, Serializable> {
}
