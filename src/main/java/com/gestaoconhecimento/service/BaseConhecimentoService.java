package com.gestaoconhecimento.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaoconhecimento.repository.BaseConhecimentoRepository;
import com.gestaoconhecimento.model.BaseConhecimento;

@Service
public class BaseConhecimentoService {
	
	private final BaseConhecimentoRepository baseConhecimentoRepository;
	
	@Autowired
	public BaseConhecimentoService(BaseConhecimentoRepository baseConhecimentoRepository) {
		this.baseConhecimentoRepository = baseConhecimentoRepository;
	}

	public List<BaseConhecimento> getBasesConhecimento() {
		
		return baseConhecimentoRepository.findAll();
	}

}
