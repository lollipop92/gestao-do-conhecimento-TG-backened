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
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.gestaoconhecimento.service.BaseConhecimentoService;
import com.gestaoconhecimento.model.BaseConhecimento;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "baseConhecimento")
public class BaseConhecimentoController {
	
	private final BaseConhecimentoService baseConhecimentoService;
	
	@Autowired
	public BaseConhecimentoController(BaseConhecimentoService baseConhecimentoService) {
		System.out.println(baseConhecimentoService);
		this.baseConhecimentoService = baseConhecimentoService;
	}
	
	@GetMapping("/all")
	public List<BaseConhecimento> getBasesConhecimento(){
		return baseConhecimentoService.getBasesConhecimento();
	}
	
	@PostMapping
	public void registrarBaseConhecimento (@RequestBody BaseConhecimento baseConhecimento) {
		baseConhecimentoService.registrarBaseConhecimento(baseConhecimento);
	}
	
	@PutMapping(path = "{baseConhecimentoId}")
	public void editarBaseConhecimento(
	@PathVariable("baseConhecimentoId") Long baseConhecimentoId, @RequestBody BaseConhecimento baseConhecimento){
		baseConhecimentoService.editarBaseConhecimento(baseConhecimentoId, 
				
				baseConhecimento.getProcesso(), 
				baseConhecimento.getEtapa(),
				baseConhecimento.getVigencia(),
				baseConhecimento.getObjetivo(),
				baseConhecimento.getCampoAplicacao(),
				baseConhecimento.getCompetencia(),
				baseConhecimento.getTreinamento(),
				baseConhecimento.getPerfil(),
				baseConhecimento.getTermosTecnicos(),
				baseConhecimento.getOrientacao(),
				baseConhecimento.getProcedimentos(),
				baseConhecimento.getTempo(),
				baseConhecimento.getIndicadores(),
				baseConhecimento.getRelatorioGestao(),
				baseConhecimento.getNormas(),
				baseConhecimento.getRecursoDuvida(),
				baseConhecimento.getAutor()
				
				);
				
	}
	
	@DeleteMapping(path = "{baseConhecimentoId}")
	public void deletarBaseConhecimento(@PathVariable("baseConhecimentoId") Long baseConhecimentoId) {
		baseConhecimentoService.deletarUsuario(baseConhecimentoId);
	}

}
