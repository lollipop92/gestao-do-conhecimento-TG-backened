package com.gestaoconhecimento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestaoconhecimento.model.Config;
import com.gestaoconhecimento.service.ConfigService;

//Resources para API

@CrossOrigin("*")
@RestController
@RequestMapping(path = "api/v1/Config")
public class ConfigController {
	
	private final ConfigService configService;
	
	@Autowired
	public ConfigController(ConfigService configService) {
		this.configService = configService;
	}
		
	@GetMapping()
	public List<Config> getConfigs(){
		return configService.getConfigs();
	}
	
	@GetMapping(path = "{configId}")
	public Config getConfig(@PathVariable("configId") Long configId) {
		return configService.getConfig(configId);
	}
	
	@PutMapping(path = "{configId}")
	public void editarConfig(
			@PathVariable("configId") Long configId, @RequestBody Config configBody
			) {		
			
		configService.editarConfig(configId, configBody.getConfig(), configBody.getValueConfig());
		
	}	

}
