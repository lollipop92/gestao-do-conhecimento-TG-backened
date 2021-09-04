package com.gestaoconhecimento.usuario;

import java.util.List;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UsuarioConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UsuarioRepository repository) {
		return args -> {
			Usuario numero1 = new Usuario( 
					"nome1",
					"email1",
					"senha1",
					"cargo1",
					"setor1"
					);
			Usuario numero2 = new Usuario( 
					"nome2",
					"email2",
					"senha2",
					"cargo2",
					"setor2"
					);	
			
			repository.saveAll(List.of(numero1,numero2));
			
		};
	}

}
