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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Factura save(Factura cliente) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
