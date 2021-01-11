package com.mySRPNT2.entity;

import java.util.Vector;

import javax.persistence.Column;
import javax.persistence.Id;

public class _UsuarioBicicleta {

	
	@Id
	@Column(
			name = "idUsuario",
			updatable = true
			)
	private long idUsuario;
	
	private Vector<Bicicleta> bicicleta;
	
	
	public _UsuarioBicicleta() {
		// TODO Auto-generated constructor stub
	}


	/**
	 * @return the idUsuario
	 */
	public long getIdUsuario() {
		return idUsuario;
	}


	/**
	 * @param idUsuario the idUsuario to set
	 */
	public void setIdUsuario(long idUsuario) {
		this.idUsuario = idUsuario;
	}


	/**
	 * @return the bicicleta
	 */
	public Vector<Bicicleta> getBicicleta() {
		return bicicleta;
	}


	/**
	 * @param bicicleta the bicicleta to set
	 */
	public void setBicicleta(Vector<Bicicleta> bicicleta) {
		this.bicicleta = bicicleta;
	}

	
	
}
