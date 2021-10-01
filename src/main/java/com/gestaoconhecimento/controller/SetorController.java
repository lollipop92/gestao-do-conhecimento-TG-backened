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

import com.gestaoconhecimento.model.Logs;
import com.gestaoconhecimento.model.Setor;
import com.gestaoconhecimento.model.Usuario;
import com.gestaoconhecimento.service.SetorService;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "setor")
public class SetorController {
	
private final SetorService setorService;
	
	@Autowired
	public SetorController(SetorService setorService) {
		this.setorService = setorService;
	}
	
	@GetMapping()
	public List<Setor> getSetores(){
		return setorService.getSetores();
	}
	
	@PostMapping
	public void registrarSetor(@RequestBody Setor setor) {
		setorService.registrarSetor(setor);
	}
	
	@DeleteMapping(path = "{setorId}")
	public void deletarSetor(@PathVariable("setorId") Long setorId) {
		setorService.deletarSetor(setorId);
	}
	
	@PutMapping(path = "{setorId}")
	public void editarSetor(
			@PathVariable("setorId") Long setorId,@RequestBody Setor setor
			) {
		
		setorService.editarSetor(setorId, setor.getSetor());
		
	}

}
