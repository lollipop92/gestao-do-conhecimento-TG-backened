package com.gestaoconhecimento.service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaoconhecimento.model.Setor;
import com.gestaoconhecimento.repository.SetorRepository;

@Service
public class SetorService {
	
private final SetorRepository setorRepository;
	
	@Autowired
	public SetorService(SetorRepository setorRepository) {
		this.setorRepository = setorRepository;
	}
	
	public List<Setor> getSetores() {
		return setorRepository.findAll();
	}
	
	public void registrarSetor(Setor setor) {
		setorRepository.save(setor);
	}
	
	public void deletarSetor(Long setorId) {
		boolean existe = setorRepository.existsById(setorId);
		if(!existe) {
			throw new IllegalStateException("Setor com identificação "+setorId+ " não existe.");
		}
		setorRepository.deleteById(setorId);
	}
	
	@Transactional
	public void editarSetor (Long setorId,
							 String setor) {
		Setor setorClasse = setorRepository.findById(setorId).orElseThrow(() -> new IllegalStateException(
				"Setor com identificação "+setorId+ " não existe."));
		
		if (setor != null && setor.length() > 0 && !Objects.equals(setorClasse.getSetor(), setor)) {
			setorClasse.setSetor(setor);
			}
	}

}
