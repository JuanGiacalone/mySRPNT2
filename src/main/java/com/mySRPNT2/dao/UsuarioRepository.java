/**
 * 
 */
package com.mySRPNT2.dao;



import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mySRPNT2.entity.Usuario;

/**
 * @author Juan
 *
 */
@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	

}
