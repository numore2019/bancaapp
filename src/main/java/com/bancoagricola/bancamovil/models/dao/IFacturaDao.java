package com.bancoagricola.bancamovil.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bancoagricola.bancamovil.models.entities.Factura;

public interface IFacturaDao extends CrudRepository<Factura, Integer>{

}
