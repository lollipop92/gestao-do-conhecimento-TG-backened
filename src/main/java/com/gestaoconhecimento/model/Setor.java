package com.gestaoconhecimento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class Setor {
	
	@Id
	@SequenceGenerator(
			name = "setor_sequence",
			sequenceName = "setor_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "setor_sequence"
			)	
	private Long id;
	private String setor;
	
	public Setor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Setor(String setor) {
		super();
		this.setor = setor;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	@Override
	public String toString() {
		return "Setor [id=" + id + ", setor=" + setor + "]";
	}
	
	
	
	

}
