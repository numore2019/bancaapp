package com.bancoagricola.bancamovil.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bancoagricola.bancamovil.models.entities.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
