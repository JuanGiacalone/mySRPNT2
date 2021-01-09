/**
 * 
 */
package com.mySRPNT2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mySRPNT2.entity.Usuario;

/**
 * @author Juan
 *
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
