package com.bancoagricola.bancamovil.models.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="factura")
public class Factura implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="idfactura")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String productos;
	private Long precio;
	private Double iva;
	
	private int id_cliente;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductos() {
		return productos;
	}

	public void setProductos(String productos) {
		this.productos = productos;
	}

	public Long getPrecio() {
		return precio;
	}

	public void setPrecio(Long precio) {
		this.precio = precio;
	}

	public Double getIva() {
		return iva;
	}

	public void setIva(Double iva) {
		this.iva = iva;
	}
	
	
	

}
