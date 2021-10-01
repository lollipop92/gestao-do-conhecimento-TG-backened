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

import com.gestaoconhecimento.model.Cargo;
import com.gestaoconhecimento.model.Setor;
import com.gestaoconhecimento.service.CargoService;

@CrossOrigin("*")
@RestController
@RequestMapping(path = "cargo")
public class CargoController {
	
private final CargoService cargoService;
	
	@Autowired
	public CargoController(CargoService cargoService) {
		this.cargoService = cargoService;
	}
	
	@GetMapping()
	public List<Cargo> getCargos(){
		return cargoService.getCargos();
	}
	
	@PostMapping
	public void registrarCargo(@RequestBody Cargo cargo) {
		cargoService.registrarCargo(cargo);
	}
	
	@DeleteMapping(path = "{cargoId}")
	public void deletarCargo(@PathVariable("cargoId") Long cargoId) {
		cargoService.deletarCargo(cargoId);
	}
	
	@PutMapping(path = "{cargoId}")
	public void editarCargo(
			@PathVariable("cargoId") Long cargoId,@RequestBody Cargo cargo
			) {
		
		cargoService.editarCargo(cargoId, cargo.getCargo());
		
	}

}
