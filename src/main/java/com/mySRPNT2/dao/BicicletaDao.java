package com.mySRPNT2.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

import com.mySRPNT2.entity.Bicicleta;


@Repository
public class BicicletaDao {
	
	private static Map<Long, Bicicleta> bicicletas;
	
	
	static {
		
		bicicletas = new HashMap<Long, Bicicleta>(){

			/**
			 * 
			 */private static final long serialVersionUID = 1L;
			
			
			{
				put((long) 1,new Bicicleta("vairo","xr40",26));
				put((long) 2,new Bicicleta("venzo","x0",29));
				put((long) 3,new Bicicleta("cannom","u10",27));
			}
			
		};
	}
	public Collection<Bicicleta> getAllBicicletas(){
		
		return BicicletaDao.bicicletas.values();
		
	}
	
	public Bicicleta getBicicletaById(long id) {
		return BicicletaDao.bicicletas.get(id);
	}

	public void removeBicicletaById(long id) {
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
