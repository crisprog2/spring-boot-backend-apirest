package com.bolsadeideas.springboot.backend.apirest.controller;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entities.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.service.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ClienteRestController {
    
    @Autowired
    private IClienteService clienteService;

    @GetMapping("/clientes")
    public List<Cliente> index(){
        return clienteService.findAll();
    }

}
