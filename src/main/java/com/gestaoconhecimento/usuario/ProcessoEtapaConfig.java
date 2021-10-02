package com.gestaoconhecimento.usuario;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gestaoconhecimento.model.ProcessoEtapa;
import com.gestaoconhecimento.repository.LogsRepository;
import com.gestaoconhecimento.repository.ProcessoEtapaRepository;

@Configuration
public class ProcessoEtapaConfig {
	
	@Bean
	CommandLineRunner commandLineRunnerProcessoEtapa (ProcessoEtapaRepository repository) {
		return args -> {
			
		
			ProcessoEtapa numero1 = new ProcessoEtapa(
					"Pagamento fornecedor",
					"Agendar pagamento"
					);
			ProcessoEtapa numero2 = new ProcessoEtapa(
					"Pagamento fornecedor",
					"Bloquear fornecedor"
					);
			ProcessoEtapa numero3 = new ProcessoEtapa(
					"Recrutamento",
					"Cadastro vaga aberta"
					);
			
			repository.saveAll(List.of(numero1,numero2,numero3));
		};
	}
}

