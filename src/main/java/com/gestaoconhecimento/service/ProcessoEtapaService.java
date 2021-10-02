package com.gestaoconhecimento.service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaoconhecimento.model.ProcessoEtapa;
import com.gestaoconhecimento.model.Setor;
import com.gestaoconhecimento.repository.ProcessoEtapaRepository;

@Service
public class ProcessoEtapaService {
	
	private final ProcessoEtapaRepository processoEtapaRepository;
	
	@Autowired
	public ProcessoEtapaService(ProcessoEtapaRepository processoEtapaRepository) {
		this.processoEtapaRepository = processoEtapaRepository;
	}
	
	public List<ProcessoEtapa> getProcessosEtapas() {
		return processoEtapaRepository.findAll();
	}
	
	public void registrarProcessoEtapa(ProcessoEtapa processoEtapa) {
		processoEtapaRepository.save(processoEtapa);
	}
	
	public void deletarProcessoEtapa(Long processoEtapaId) {
		boolean existe = processoEtapaRepository.existsById(processoEtapaId);
		if(!existe) {
			throw new IllegalStateException("Processo e etapa com identificação "+processoEtapaId+ " não existe.");
		}
		processoEtapaRepository.deleteById(processoEtapaId);
	}
	
	@Transactional
	public void editarProcessoEtapa (Long processoEtapaId,
							 String processo,
							 String etapa) {
		ProcessoEtapa processoEtapa = processoEtapaRepository.findById(processoEtapaId).orElseThrow(() -> new IllegalStateException(
				"Processo e etapa com identificação "+processoEtapaId+ " não existe."));
		
		if (processo != null && processo.length() > 0 && !Objects.equals(processoEtapa.getProcesso(), processo)) {
			processoEtapa.setProcesso(processo);
			}
		
		if (etapa != null && etapa.length() > 0 && !Objects.equals(processoEtapa.getEtapa(), etapa)) {
			processoEtapa.setEtapa(etapa);
			}
	}

}
