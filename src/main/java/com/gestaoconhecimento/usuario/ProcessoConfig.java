package com.gestaoconhecimento.usuario;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gestaoconhecimento.model.Processo;
import com.gestaoconhecimento.repository.ProcessoRepository;

@Configuration
public class ProcessoConfig {
	
	@Bean
	CommandLineRunner commandLineRunnerProcesso (ProcessoRepository repository) {
		return args -> {
			
			Processo numero1 = new Processo(
					"Contas a pagar",
					"bloquear forncedor",
					1L,
					2L,
					"2021-09-28",
					"Executando",
					1,					
					"X_",
					"_",
					"_",
					"_" );
			Processo numero2 = new Processo(
					"Contas a pagar",
					"agendar pagamento",
					2L,
					1L,
					"2021-09-28",
					"Executando",
					2,					
					"X_X",
					"X_",
					"_",
					"_" );
			Processo numero3 = new Processo(
					"Calibração de esquipamentos",
					"calibrar termometro digital",
					1L,
					2L,
					"2021-09-28",
					"Executando",
					3,					
					"X_X",
					"X_X",
					"_X",
					"_" );
			
			repository.saveAll(List.of(numero1,numero2,numero3));
			
		};
	}

}
