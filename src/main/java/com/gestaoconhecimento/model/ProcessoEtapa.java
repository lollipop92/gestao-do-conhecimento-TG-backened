package com.gestaoconhecimento.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class ProcessoEtapa {
	
	@Id
	@SequenceGenerator(
			name = "processoEtapa_sequence",
			sequenceName = "processoEtapa_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "processoEtapa_sequence"
			)
	private Long id;
	private String processo;
	private String etapa;
	
	public ProcessoEtapa() {
		super();
		
	}

	public ProcessoEtapa(String processo, String etapa) {
		super();
		this.processo = processo;
		this.etapa = etapa;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProcesso() {
		return processo;
	}

	public void setProcesso(String processo) {
		this.processo = processo;
	}

	public String getEtapa() {
		return etapa;
	}

	public void setEtapa(String etapa) {
		this.etapa = etapa;
	}

	@Override
	public String toString() {
		return "ProcessoEtapa [id=" + id + ", processo=" + processo + ", etapa=" + etapa + "]";
	}
	
	
	
	

}
