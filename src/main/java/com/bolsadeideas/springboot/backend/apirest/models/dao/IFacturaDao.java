package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entities.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Long>{
    
}
