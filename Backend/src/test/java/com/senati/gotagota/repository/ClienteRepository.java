package com.senati.gotagota.repository;

Import com.senati.gotagota.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

//Anotacion @repository INTERFAZ COMO LA CAPA DE ACCESO A LA BASE DE DATOS
@Repository

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
//No necesitamos escribir nada aqui
    //JpaRepository ya tiene todo_lo_basico

}
