package com.gestaoconhecimento.model;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner;

@Entity
@Table
public class Logs implements Serializable{
	
	@Id
	@SequenceGenerator(
			name = "logs_sequence",
			sequenceName = "logs_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "logs_sequence"
			)	
	private Long id;
	private String acao;
	private String timeStamp;
	private Long idUsuario;
	private String entidade;
	private String descricao;
	
	public Logs() {
		super();
		
	}
	
	

	public Logs(String acao, String timeStamp, Long idUsuario, String entidade, String descricao) {
		super();
		this.acao = acao;
		this.timeStamp = timeStamp;
		this.idUsuario = idUsuario;
		this.entidade = entidade;
		this.descricao = descricao;
	}



	public Logs(Long id, String acao, String timeStamp, Long idUsuario, String entidade, String descricao) {
		super();
		this.id = id;
		this.acao = acao;
		this.timeStamp = timeStamp;
		this.idUsuario = idUsuario;
		this.entidade = entidade;
		this.descricao = descricao;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getAcao() {
		return acao;
	}



	public void setAcao(String acao) {
		this.acao = acao;
	}



	public String getTimeStamp() {
		return timeStamp;
	}



	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}



	public Long getIdUsuario() {
		return idUsuario;
	}



	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}



	public String getEntidade() {
		return entidade;
	}



	public void setEntidade(String entidade) {
		this.entidade = entidade;
	}



	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	@Override
	public String toString() {
		return "Logs [id=" + id + ", acao=" + acao + ", timeStamp=" + timeStamp + ", idUsuario=" + idUsuario
				+ ", entidade=" + entidade + ", descricao=" + descricao + "]";
	}
	
	
	
	

}


