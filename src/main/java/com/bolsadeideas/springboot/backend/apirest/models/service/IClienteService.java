package com.bolsadeideas.springboot.backend.apirest.models.service;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entities.Cliente;

public interface IClienteService {
    public List<Cliente> findAll();
}
