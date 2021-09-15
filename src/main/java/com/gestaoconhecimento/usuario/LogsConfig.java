package com.gestaoconhecimento.usuario;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gestaoconhecimento.model.Logs;
import com.gestaoconhecimento.repository.LogsRepository;


@Configuration
public class LogsConfig {
	
		
	@Bean
	CommandLineRunner commandLineRunnerLogs (LogsRepository repository) {
		return args -> {
			
			java.sql.Timestamp timestamp = java.sql.Timestamp.valueOf("2007-09-23 10:10:10.0");			
			
			Logs numero1 = new Logs(
					"acao teste",
					"2021-09-14 22:46:37.326",
					2L,
					"teste 2",
					"testando funcionalidades");
			Logs numero2 = new Logs(
					"acao teste 2",
					"2021-09-14 22:46:37.326",
					3L,
					"teste 2",
					"testando funcionalidades ");
			
			repository.saveAll(List.of(numero1,numero2));
		}; 
		
	}
	

}
