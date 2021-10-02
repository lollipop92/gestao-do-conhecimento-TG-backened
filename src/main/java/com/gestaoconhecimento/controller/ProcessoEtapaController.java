package com.gestaoconhecimento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestaoconhecimento.model.ProcessoEtapa;
import com.gestaoconhecimento.model.Setor;
import com.gestaoconhecimento.service.ProcessoEtapaService;


@CrossOrigin("*")
@RestController
@RequestMapping(path = "processo_etapa")
public class ProcessoEtapaController {
	

private final ProcessoEtapaService processoEtapaService;
	
	@Autowired
	public ProcessoEtapaController(ProcessoEtapaService processoEtapaService) {
		this.processoEtapaService = processoEtapaService;
	}
	
	@GetMapping()
	public List<ProcessoEtapa> getProcessosEtapas(){
		return processoEtapaService.getProcessosEtapas();
	}
	
	@PostMapping
	public void registrarProcessoEtapa(@RequestBody ProcessoEtapa processoEtapa) {
		processoEtapaService.registrarProcessoEtapa(processoEtapa);
	}
	
	@DeleteMapping(path = "{processoEtapaId}")
	public void deletarProcessoEtapa(@PathVariable("processoEtapaId") Long processoEtapaId) {
		processoEtapaService.deletarProcessoEtapa(processoEtapaId);
	}
	
	@PutMapping(path = "{processoEtapaId}")
	public void editarProcessoEtapa(
			@PathVariable("processoEtapaId") Long processoEtapaId,@RequestBody ProcessoEtapa processoEtapa
			) {
		
		processoEtapaService.editarProcessoEtapa(processoEtapaId, processoEtapa.getProcesso(), processoEtapa.getEtapa());
		
	}
}
