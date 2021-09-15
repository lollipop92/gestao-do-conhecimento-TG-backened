package com.gestaoconhecimento.usuario;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gestaoconhecimento.model.Config;
import com.gestaoconhecimento.repository.ConfigRepository;

@Configuration
public class ConfigConfig {
	
	@Bean
	CommandLineRunner commandLineRunnerConfig (ConfigRepository repository) {
		return args -> {
			Config numero1 = new Config(
					"Dominio",
					"@learnhow");
			Config numero2 = new Config(
					"Numero máximo de processos",
					"10");
			
			repository.saveAll(List.of(numero1,numero2));
		};
	}	

}
