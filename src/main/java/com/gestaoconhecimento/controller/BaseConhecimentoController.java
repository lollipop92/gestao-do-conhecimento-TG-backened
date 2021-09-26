package com.gestaoconhecimento.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestaoconhecimento.service.BaseConhecimentoService;
import com.gestaoconhecimento.model.BaseConhecimento;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "baseConhecimento")
public class BaseConhecimentoController {
	
	private final BaseConhecimentoService baseConhecimentoService;
	
	@Autowired
	public BaseConhecimentoController(BaseConhecimentoService baseConhecimentoService) {
		this.baseConhecimentoService = baseConhecimentoService;
	}
	
	@GetMapping("/all")
	public List<BaseConhecimento> getBasesConhecimento(){
		return baseConhecimentoService.getBasesConhecimento();
	}

}
