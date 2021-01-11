package com.mySRPNT2.dao;

import java.util.Collection;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mySRPNT2.entity.Bicicleta;


@Repository
public class BicicletaDao {
	
	@Autowired
	private BicicletaRepository bicicletaRepository;
	
	
	public Collection<Bicicleta> getAllBicicletas(){
		
		return bicicletaRepository.findAll();
		
	}
	
	public Optional<Bicicleta> getBicicletaById(long id) {
		return bicicletaRepository.findById(id);
	}

	public void removeBicicletaById(long id) {
		bicicletaRepository.deleteById(id);
	}
	public void updateBicicleta(Bicicleta bicicleta) {
		
		
		bicicletaRepository.saveAndFlush(bicicleta);
		
	}
}
