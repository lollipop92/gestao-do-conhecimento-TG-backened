package com.gestaoconhecimento.service;

import java.util.List;
import java.util.Objects;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaoconhecimento.model.Cargo;
import com.gestaoconhecimento.model.Setor;
import com.gestaoconhecimento.repository.CargoRepository;

@Service
public class CargoService {
	
private final CargoRepository cargoRepository;
	
	@Autowired
	public CargoService(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}
	
	public List<Cargo> getCargos() {
		return cargoRepository.findAll();
	}
	
	public void registrarCargo(Cargo cargo) {
		cargoRepository.save(cargo);
	}
	
	public void deletarCargo(Long cargoId) {
		boolean existe = cargoRepository.existsById(cargoId);
		if(!existe) {
			throw new IllegalStateException("Cargo com identificação "+cargoId+ " não existe.");
		}
		cargoRepository.deleteById(cargoId);
	}
	
	@Transactional
	public void editarCargo (Long cargoId,
							 String cargo) {
		Cargo cargoClasse = cargoRepository.findById(cargoId).orElseThrow(() -> new IllegalStateException(
				"Cargo com identificação "+cargoId+ " não existe."));
		
		if (cargo != null && cargo.length() > 0 && !Objects.equals(cargoClasse.getCargo(), cargo)) {
			cargoClasse.setCargo(cargo);
			}
	}

}
