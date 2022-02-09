package com.bolsadeideas.springboot.backend.apirest.models.dao;

import java.util.List;

import com.bolsadeideas.springboot.backend.apirest.models.entities.Cliente;
import com.bolsadeideas.springboot.backend.apirest.models.entities.Region;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface IClienteDao extends JpaRepository<Cliente, Long> {

    @Query("from Region")
    public List<Region> findAllRegiones();
}
