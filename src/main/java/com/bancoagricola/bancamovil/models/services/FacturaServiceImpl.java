package com.bancoagricola.bancamovil.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bancoagricola.bancamovil.models.dao.IFacturaDao;
import com.bancoagricola.bancamovil.models.entities.Factura;

@Service
public class FacturaServiceImpl implements IFacturaService{
	
	@Autowired
	private IFacturaDao facturaDao;

	@Override
	public List<Factura> findAll() {
		return (List<Factura>) facturaDao.findAll();
	}

	@Override
	public Factura findById(int id) {
		return facturaDao.findById(id).orElse(null);
	}

	@Override
	public Factura save(Factura factura) {
		return facturaDao.save(factura);
	}

	@Override
	public void delete(int id) {
		facturaDao.deleteById(id);
		
	}

}
