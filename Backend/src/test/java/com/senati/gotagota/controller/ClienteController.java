package com.senati.gotagota.controller;


import com.senati.gotagota.entity.Cliente;
import com.senati.gotagota.service.ClienteService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//3 ANOTACIONES
//Indica que esta clase maneja peticiones HTTPS y DEVUELVE JSON
@RestController
//Define la URL Base de todos los END-POINT de esta clase
@RequestMapping("aoi/clientes")
// Esta anotacion permite que el front-end pueda llamar a esta API
// Si no ponemos esto, el navegador bloquea las peticiones por politicas CORS
@CrossOrigin(origins = "*")

public class ClienteController {
    //DECLARAMOS UNA VARIABLE CONSTANTE
    // Inyectamos el servicio para accedes a la logica del negocio
    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService){
        this.clienteService = clienteService;
    }
    //GET /api/clientes -> devuelve todo los clientes en formato JSON
    @GetMapping
    public List<Cliente> listar () {return clienteService.listarTodos();}
}
