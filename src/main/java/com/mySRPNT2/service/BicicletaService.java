package com.mySRPNT2.service;

import java.util.Collection;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mySRPNT2.dao.BicicletaDao;
import com.mySRPNT2.entity.Bicicleta;


@Service
public class BicicletaService {
	
		@Autowired
		private BicicletaDao bicicletaDao;
	
		public Collection<Bicicleta> getAllBicicletas(){
		
		return this.bicicletaDao.getAllBicicletas();
		
	    }
		
		public Optional<Bicicleta> getBicicletaById(long id) {
			return this.bicicletaDao.getBicicletaById(id);
		}

		public void removeBicicletaById(int id) {
			this.bicicletaDao.removeBicicletaById(id);
			
		}
		
		public void updateBicicleta(Bicicleta bicicleta) {
			
			this.bicicletaDao.updateBicicleta(bicicleta);
		}
	}
		


