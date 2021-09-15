package com.gestaoconhecimento.service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaoconhecimento.model.Config;
import com.gestaoconhecimento.repository.ConfigRepository;

@Service
public class ConfigService {
	
	private final ConfigRepository configRepository;
	
	@Autowired
	public ConfigService(ConfigRepository configRepository) {
		this.configRepository = configRepository;
	}
	
	// Mostrar todas as configurações
	public List<Config> getConfigs() {
		return configRepository.findAll();
		  
	}
	
	// Mostrar configuração 
	public Config getConfig(Long configId) {
		Config config = configRepository.findById(configId).orElseThrow(() -> new IllegalStateException(
				"Configuração não existe"));
		
		return config;
		
	}
	
	// Editar configuração com body
	@Transactional
	public void editarConfig(Long configId, String configBody, String valueConfigBody) {
				
		Config config = configRepository.findById(configId).orElseThrow(() -> new IllegalStateException(
				"Configuração não existe."));
		if (configBody != null && configBody.length() > 0 && !Objects.equals(config.getConfig(), configBody)) {
			config.setConfig(configBody);
			System.out.println(configBody);
			}
		
		if (valueConfigBody != null && valueConfigBody.length() > 0 && !Objects.equals(config.getValueConfig(), valueConfigBody)) {
			config.setValueConfig(valueConfigBody);
			
			}
		
	}
	
}
