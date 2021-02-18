package com.bancoagricola.bancamovil.models.services;

import java.util.List;

import com.bancoagricola.bancamovil.models.entities.Cliente;

public interface IClienteService {
	
	public List<Cliente> findAll();
	
	public Cliente findById(Long id);
	
	public Cliente save(Cliente cliente);

	public void delete(Long id);
}
