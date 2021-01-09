package com.mySRPNT2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;



@Entity(name = "Bicicleta")
@Table(
		name = "bicicleta"
		/*uniqueConstraints = {
				@UniqueConstraint(name = "", columnNames = "")
		}*/ /// usar cuando una constraint toma nombre dificil de leer.
		)
public class Bicicleta {
	
	@Id
	@SequenceGenerator(
			name = "bicicleta_sequence",
			sequenceName  = "bicicleta_sequence",
			allocationSize = 1 )
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "bicicleta_sequence"
			)
	@Column(
			name = "id",
			updatable = false
			)
	private long id;
	@Column( 
			name = "marca",
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String marca;
	
	@Column( 
			name = "modelo",
			nullable = false,
			columnDefinition = "TEXT"
			
			/// unique = true (se usa para los emails)
			)
	private String modelo;
	
	@Column( name = "rodado")
	private int rodado;

	/////////////////////////////////////////////////////////////////////////////////////
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
	
	
	
	@Override
	public String toString() {
		return "Bicicleta [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", rodado=" + rodado + "]";
	}
	public Bicicleta(String marca, String modelo, int rodado) {
		super();
		
		this.marca = marca;
		this.modelo = modelo;
		this.rodado = rodado;
	}
	public Bicicleta() {};
	
}
