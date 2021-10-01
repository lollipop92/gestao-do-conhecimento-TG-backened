package com.gestaoconhecimento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestaoconhecimento.model.BaseConhecimento;
import com.gestaoconhecimento.model.Config;
import com.gestaoconhecimento.model.Processo;
import com.gestaoconhecimento.service.ProcessoService;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "processo")
public class ProcessoController {
	
	private final ProcessoService processoService;
	
	@Autowired
	public ProcessoController(ProcessoService processoService) {
		this.processoService = processoService;
	}
	
	@GetMapping()
	public List<Processo> getProcessos(){
		return processoService.getProcessos();
	}
	
	@GetMapping(path = "{processoId}")
	public Processo getProcesso(@PathVariable("processoId") Long processoId){
		return processoService.getProcesso(processoId);
			
	}
	
	@PostMapping
	public void registrarProcesso (@RequestBody Processo processo) {
		processoService.registrarProcesso(processo);
	}
	
	
	@PutMapping(path = "{processoId}")
	public void editarProcesso(
	@PathVariable("processoId") Long processoId, @RequestBody Processo processo){
		processoService.editarBaseConhecimento(processoId, 
				
				processo.getProcesso(),
				processo.getEtapa(),
				processo.getTreinador(),
				processo.getTreinado(),
				processo.getData(),
				processo.getStatus(),
				processo.getEtapaIndice(),
				processo.getEtapa1(),
				processo.getEtapa2(),
				processo.getEtapa3(),
				processo.getEtapa4()
				);
	}

}
