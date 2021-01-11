package com.mySRPNT2.controller;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;



import com.mySRPNT2.entity.Bicicleta;
import com.mySRPNT2.service.BicicletaService;

@RestController
@RequestMapping("api/")
public class BicicletaController {
	
	
	@Autowired
	private BicicletaService bicicletaService;
	
	
	@GetMapping("bicicletas")
	public Collection<Bicicleta> getAllBicicletas(){
	
	return this.bicicletaService.getAllBicicletas();
	}
	
	@GetMapping(path = "bicicletas/{id}")
	public Optional<Bicicleta> getBicicletaById(@PathVariable("id") int id){
		
		return bicicletaService.getBicicletaById(id);
		
	}
	
	@DeleteMapping(path = "bicicletas/supr/{id}")
	public void deleteBicicletaById(@PathVariable("id") int id) {
		bicicletaService.removeBicicletaById(id);
	}
	
	///
	
	@PutMapping(path = "bicicletas/add",consumes = MediaType.APPLICATION_JSON_VALUE)
	public void updateBicicleta(@RequestBody Bicicleta bicicleta) {
		bicicletaService.updateBicicleta(bicicleta);
	}
	
	

}
