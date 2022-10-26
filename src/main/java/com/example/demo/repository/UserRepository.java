package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.User;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Serializable> {
    public List<User> findByIdUsuarioAndContrasenia(int IdUsuario, String Contrasenia);

}
