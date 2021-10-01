package com.gestaoconhecimento.usuario;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gestaoconhecimento.model.Cargo;
import com.gestaoconhecimento.model.Setor;
import com.gestaoconhecimento.repository.LogsRepository;
import com.gestaoconhecimento.repository.SetorRepository;

@Configuration
public class SetorConfig {
	
	@Bean
	CommandLineRunner commandLineRunnerSetor (SetorRepository repository) {
		return args -> {
			
			Setor numero1 = new Setor (
					"Financeiro"
				);
				
			Setor numero2 = new Setor (
					"RH"
				);
				
				repository.saveAll(List.of(numero1,numero2));
			};
		}
}
