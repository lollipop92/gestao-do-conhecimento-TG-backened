package com.gestaoconhecimento.usuario;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gestaoconhecimento.model.Cargo;
import com.gestaoconhecimento.repository.CargoRepository;
import com.gestaoconhecimento.repository.LogsRepository;

@Configuration
public class CargoConfig {
	
	@Bean
	CommandLineRunner commandLineRunnerCargo (CargoRepository repository) {
		return args -> {
			
			Cargo numero1 = new Cargo (
				"Analista"
			);
			
			Cargo numero2 = new Cargo (
				"Gerente"
			);
			
			repository.saveAll(List.of(numero1,numero2));
		};
	}
}
