package com.bancoagricola.bancamovil.models.services;

import java.util.List;

import com.bancoagricola.bancamovil.models.entities.Factura;

public interface IFacturaService {

	public List<Factura> findAll();
	
	public Factura findById(int id);
	
	public Factura save(Factura cliente);
	
	public void delete(int id);
	
}
