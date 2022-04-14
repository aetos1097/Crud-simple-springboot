package com.spring.prueba.controlador;

import com.spring.prueba.modelos.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.spring.prueba.respositorio.InterfaceUsuario;

import java.util.List;

@RestController
@RequestMapping("/User")

public class UserControlador {
    @Autowired
    private InterfaceUsuario interfaceUsuario;

    @GetMapping()
    public List<User> usuarios(){
        return (List<User>) interfaceUsuario.findAll();
    }
    @PostMapping
    public void insertar(@RequestBody User users){
        interfaceUsuario.save(users);
    }

    @PutMapping
    public void modificar(@RequestBody User users){
        interfaceUsuario.save(users);
    }

    @DeleteMapping(value = "/{id}")
    public void eliminar(@PathVariable("id") Integer id){
        interfaceUsuario.deleteById(id);

    }
}
