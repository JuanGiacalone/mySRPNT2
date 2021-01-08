package com.mySRPNT2.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mySRPNT2.entity.Bicicleta;


@Repository
public class BicicletaDao {
	
	private static Map<Integer, Bicicleta> bicicletas;
	
	
	static {
		
		bicicletas = new HashMap<Integer, Bicicleta>(){

			/**
			 * 
			 */private static final long serialVersionUID = 1L;
			
			
			{
				put(1,new Bicicleta(1,"vairo","xr40",26));
				put(2,new Bicicleta(2,"venzo","x0",29));
				put(3,new Bicicleta(3,"cannom","u10",27));
			}
			
		};
	}
	public Collection<Bicicleta> getAllBicicletas(){
		
		return BicicletaDao.bicicletas.values();
		
	}
	
	public Bicicleta getBicicletaById(int id) {
		return BicicletaDao.bicicletas.get(id);
	}

	public void removeBicicletaById(int id) {
		BicicletaDao.bicicletas.remove(id);
	}
	public void updateBicicleta(Bicicleta bicicleta) {
		Bicicleta b = bicicletas.get(bicicleta.getId());
		
		///b.setId(bicicleta.getId());
		b.setMarca(bicicleta.getMarca());
		b.setModelo(bicicleta.getModelo());
		b.setRodado(bicicleta.getRodado());
		bicicletas.put(bicicleta.getId(), bicicleta);
		
	}
}
