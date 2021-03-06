package com.mySRPNT2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;


import com.mySRPNT2.dao.BicicletaRepository;
import com.mySRPNT2.entity.Bicicleta;



@SpringBootApplication
@EnableSpringDataWebSupport
public class Main {

	public static void main(String[] args) {
		
		SpringApplication.run(Main.class, args);

	}
	
	@Bean
	CommandLineRunner commandLineRunner(BicicletaRepository bicicletaRepository){
		
		return args -> {
			
			Bicicleta  b = new Bicicleta(
					"maga",
					"xtech",
					29
					);
			
			bicicletaRepository.save(b);
		};
	}

}
