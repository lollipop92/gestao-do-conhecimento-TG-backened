package com.gestaoconhecimento.usuario;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gestaoconhecimento.model.Usuario;
import com.gestaoconhecimento.repository.UsuarioRepository;

@Configuration
public class UsuarioConfig {
	
	@Bean
	CommandLineRunner commandLineRunner(UsuarioRepository repository) {
		return args -> {
			Usuario numero1 = new Usuario( 
					"Amanda",
					"amanda@learnhow.com",
					"Amanda2021",
					"admin",
					"TI"
					);
			Usuario numero2 = new Usuario( 
					"José",
					"Jose@learnhow.com",
					"Amanda2021",
					"operacional",
					"Manutenção"
					);
			Usuario numero3 = new Usuario( 
					"Ana",
					"ana@learnhow.com",
					"Amanda2021",
					"analista",
					"Financeiro"
					);
			Usuario numero4 = new Usuario( 
					"Pamela",
					"pamela@learnhow.com",
					"Amanda2021",
					"gerente",
					"RH"
					);
			
			repository.saveAll(List.of(numero1,numero2,numero3,numero4));
			
		};
	}

}
