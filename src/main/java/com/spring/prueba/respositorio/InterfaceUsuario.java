package com.spring.prueba.respositorio;

import com.spring.prueba.modelos.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InterfaceUsuario extends CrudRepository<User, Integer> {
}
