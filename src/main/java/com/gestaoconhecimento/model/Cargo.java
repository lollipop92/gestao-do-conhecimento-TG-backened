package com.gestaoconhecimento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Cargo {
	
	@Id
	@SequenceGenerator(
			name = "cargo_sequence",
			sequenceName = "cargo_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "cargo_sequence"
			)	
	private Long id;
	private String cargo;
	
	public Cargo() {
		super();
		
	}

	public Cargo(String cargo) {
		super();
		this.cargo = cargo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Cargo [id=" + id + ", cargo=" + cargo + "]";
	}
	
	
	
	

}
