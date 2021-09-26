package com.gestaoconhecimento.usuario;

import java.util.List;

import org.aspectj.weaver.patterns.ArgsAnnotationPointcut;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.gestaoconhecimento.model.BaseConhecimento;
import com.gestaoconhecimento.repository.BaseConhecimentoRepository;

@Configuration
public class BaseConhecimentoConfig {
	
	@Bean
	CommandLineRunner commandLineRunnerBaseConhecimento (BaseConhecimentoRepository repository) {
		return args -> {
			
			BaseConhecimento numero1 = new BaseConhecimento(
					"processo",
					"etapa",
					"26/09/2021",
					"objetivo",
					"campoAplicacao",
					"competencia",
					"treinamento",
					"perfil",
					"termosTecnicos",
					"orientacao",					
					"procedimentos",
					"tempo",
					"indicadores",
					"relatorioGestao",
					"normas",
					"recursoDuvida",
					2L);
			
			BaseConhecimento numero2 = new BaseConhecimento(
					"processo2",
					"etapa2",
					"01/03/2021",
					"objetivo",
					"campoAplicacao",
					"competencia",
					"treinamento",
					"perfil",
					"termosTecnicos",
					"orientacao",					
					"procedimentos",
					"tempo",
					"indicadores",
					"relatorioGestao",
					"normas",
					"recursoDuvida",
					1L);
			
			repository.saveAll(List.of(numero1, numero2));
			
		};
	}

}
