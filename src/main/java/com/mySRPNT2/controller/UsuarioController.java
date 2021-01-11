/**
 * 
 */
package com.mySRPNT2.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mySRPNT2.dao.UsuarioRepository;
import com.mySRPNT2.entity.Usuario;


/**
 * @author Juan
 *
 */
@RestController
@RequestMapping("api/")
public class UsuarioController {

	/**
	 * 
	
	 */
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@GetMapping("usuarios")
	public Collection<Usuario> getUsers(){
		
		return this.usuarioRepository.findAll();
	}
	
	@GetMapping("usuarios/{id}")
	public Optional<Usuario> getUsersByID(@PathVariable("id") long id){
		
		return this.usuarioRepository.findById(id);
	}
	
	
	
	public UsuarioController() {
		// TODO Auto-generated constructor stub
	}

}
