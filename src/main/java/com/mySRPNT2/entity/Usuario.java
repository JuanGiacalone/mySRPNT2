/**
 * 
 */
package com.mySRPNT2.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * @author Juan
 *
 */
@Entity(name = "Usuario")
@Table(
		name = "usuario"
		/*uniqueConstraints = {
				@UniqueConstraint(name = "", columnNames = "")
		}*/ /// usar cuando una constraint toma nombre dificil de leer.
		)
public class Usuario {
	
	@Id
	@SequenceGenerator(
			name = "usuario_sequence",
			sequenceName  = "usuario_sequence",
			allocationSize = 1 )
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "usuario_sequence"
			)
	@Column(
			name = "id",
			updatable = false
			)
	private long id;
	
	
	/*TODO*/
	private String contrasenia;
	
	
	@Column( 
			name = "primerNombre",
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String primerNombre;
	
	@Column( 
			name = "apellido",
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String apellido;
	
	/*TODO*/
	@Column( 
			name = "fechaNac",
			nullable = false,
			columnDefinition = "TEXT"
			)
	private String fechaNac;
	
	
	
	
	
	
	
	
	/**
	 * 
	 */
	public Usuario() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
