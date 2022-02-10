package com.bolsadeideas.springboot.backend.apirest.models.service;

import com.bolsadeideas.springboot.backend.apirest.models.entities.Usuario;

public interface IUsuarioService {

    public Usuario findByUsername(String username);
    
}
