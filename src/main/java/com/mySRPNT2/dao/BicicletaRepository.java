package com.mySRPNT2.dao;






import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.mySRPNT2.entity.Bicicleta;
@Repository
public interface BicicletaRepository extends JpaRepository<Bicicleta, Long> {



	
}
