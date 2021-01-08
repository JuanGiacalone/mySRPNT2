package com.mySRPNT2.entity;

public class Bicicleta {
	
	private int id;
	private String marca;
	private String modelo;
	private int rodado;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getRodado() {
		return rodado;
	}
	public void setRodado(int rodado) {
		this.rodado = rodado;
	}
	
	public Bicicleta(int id, String marca, String modelo, int rodado) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.rodado = rodado;
	}
	public Bicicleta() {};
	
}
