package com.gestaoconhecimento.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.xml.crypto.Data;

@Entity
@Table
public class Processo implements Serializable{

	
	
	@Id
	@SequenceGenerator(
			name = "processo_sequence",
			sequenceName = "processo_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "processo_sequence"
			)
	private Long id;
	private Long mestre;
	private Long aprendiz;
	private String data;
	private String titulo;
	private String status;
	private int etapaIndice;
	private String etapa1;
	private String etapa2;
	private String etapa3;
	private String etapa4;
	
	public Processo() {
		super();
		
	}

	public Processo(Long mestre, Long aprendiz, String data, String titulo, String status, int etapaIndice, String etapa1,
			String etapa2, String etapa3, String etapa4) {
		super();
		this.mestre = mestre;
		this.aprendiz = aprendiz;
		this.data = data;
		this.titulo = titulo;
		this.status = status;
		this.etapaIndice = etapaIndice;
		this.etapa1 = etapa1;
		this.etapa2 = etapa2;
		this.etapa3 = etapa3;
		this.etapa4 = etapa4;
	}

	public Processo(Long id, Long mestre, Long aprendiz, String data, String titulo, String status, int etapaIndice,
			String etapa1, String etapa2, String etapa3, String etapa4) {
		super();
		this.id = id;
		this.mestre = mestre;
		this.aprendiz = aprendiz;
		this.data = data;
		this.titulo = titulo;
		this.status = status;
		this.etapaIndice = etapaIndice;
		this.etapa1 = etapa1;
		this.etapa2 = etapa2;
		this.etapa3 = etapa3;
		this.etapa4 = etapa4;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getMestre() {
		return mestre;
	}

	public void setMestre(Long mestre) {
		this.mestre = mestre;
	}

	public Long getAprendiz() {
		return aprendiz;
	}

	public void setAprendiz(Long aprendiz) {
		this.aprendiz = aprendiz;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public int getEtapaIndice() {
		return etapaIndice;
	}

	public void setEtapaIndice(int etapaIndice) {
		this.etapaIndice = etapaIndice;
	}

	public String getEtapa1() {
		return etapa1;
	}

	public void setEtapa1(String etapa1) {
		this.etapa1 = etapa1;
	}

	public String getEtapa2() {
		return etapa2;
	}

	public void setEtapa2(String etapa2) {
		this.etapa2 = etapa2;
	}

	public String getEtapa3() {
		return etapa3;
	}

	public void setEtapa3(String etapa3) {
		this.etapa3 = etapa3;
	}

	public String getEtapa4() {
		return etapa4;
	}

	public void setEtapa4(String etapa4) {
		this.etapa4 = etapa4;
	}

	@Override
	public String toString() {
		return "Processo [id=" + id + ", mestre=" + mestre + ", aprendiz=" + aprendiz + ", data=" + data + ", titulo="
				+ titulo + ", status=" + status + ", etapaIndice=" + etapaIndice + ", etapa1=" + etapa1 + ", etapa2="
				+ etapa2 + ", etapa3=" + etapa3 + ", etapa4=" + etapa4 + "]";
	}
	
	
	
	
	
}
