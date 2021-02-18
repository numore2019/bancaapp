package com.bancoagricola.bancamovil.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoagricola.bancamovil.models.dao.IClienteDao;
import com.bancoagricola.bancamovil.models.entities.Cliente;

@Service
public class ClienteServiceImpl implements IClienteService{
	
	@Autowired
	private IClienteDao clienteDao;

	@Override
	public List<Cliente> findAll() {
		
		return (List<Cliente>) clienteDao.findAll();
	}

	@Override
	public Cliente findById(Long id) {
		
		return clienteDao.findById(id).orElse(null);
	}

	@Override
	public Cliente save(Cliente cliente) {
		return clienteDao.save(cliente);
	}

	@Override
	public void delete(Long id) {
		clienteDao.deleteById(id);
		
	}

}
