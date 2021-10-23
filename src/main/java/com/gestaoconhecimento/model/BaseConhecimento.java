package com.gestaoconhecimento.model;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table
public class BaseConhecimento implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@SequenceGenerator(
			name = "baseConhecimento_sequence",
			sequenceName = "baseConhecimento_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "baseConhecimento_sequence"
			)
	private Long id;
	private String processo;
	private String etapa;
	private String vigencia;
	private String objetivo;
	private String campoAplicacao;
	private String competencia;
	private String treinamento;
	private String perfil;
	private String termosTecnicos;
	private String orientacao;
	@JsonIgnore
	@JoinColumn(name = "files_id")
	private String fluxograma;
	private String procedimentos;
	private String tempo;
	private String indicadores;
	private String relatorioGestao;
	private String normas;
	private String recursoDuvida;
	private Long autor;
	@JsonIgnore
	@JoinColumn(name = "files_id")
	private String arquivoComplementar;
	
	public BaseConhecimento() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public BaseConhecimento(String processo, String etapa, String vigencia, String objetivo, String campoAplicacao,
			String competencia, String treinamento, String perfil, String termosTecnicos, String orientacao,
			String fluxograma, String procedimentos, String tempo, String indicadores, String relatorioGestao,
			String normas, String recursoDuvida, Long autor) {
		super();
		this.processo = processo;
		this.etapa = etapa;
		this.vigencia = vigencia;
		this.objetivo = objetivo;
		this.campoAplicacao = campoAplicacao;
		this.competencia = competencia;
		this.treinamento = treinamento;
		this.perfil = perfil;
		this.termosTecnicos = termosTecnicos;
		this.orientacao = orientacao;
		this.fluxograma = fluxograma;
		this.procedimentos = procedimentos;
		this.tempo = tempo;
		this.indicadores = indicadores;
		this.relatorioGestao = relatorioGestao;
		this.normas = normas;
		this.recursoDuvida = recursoDuvida;
		this.autor = autor;
	}

	public BaseConhecimento(Long id, String processo, String etapa, String vigencia, String objetivo,
			String campoAplicacao, String competencia, String treinamento, String perfil, String termosTecnicos,
			String orientacao, String fluxograma, String procedimentos, String tempo, String indicadores,
			String relatorioGestao, String normas, String recursoDuvida, Long autor) {
		super();
		this.id = id;
		this.processo = processo;
		this.etapa = etapa;
		this.vigencia = vigencia;
		this.objetivo = objetivo;
		this.campoAplicacao = campoAplicacao;
		this.competencia = competencia;
		this.treinamento = treinamento;
		this.perfil = perfil;
		this.termosTecnicos = termosTecnicos;
		this.orientacao = orientacao;
		this.fluxograma = fluxograma;
		this.procedimentos = procedimentos;
		this.tempo = tempo;
		this.indicadores = indicadores;
		this.relatorioGestao = relatorioGestao;
		this.normas = normas;
		this.recursoDuvida = recursoDuvida;
		this.autor = autor;
	}
	
	

	public BaseConhecimento(String processo, String etapa, String vigencia, String objetivo, String campoAplicacao,
			String competencia, String treinamento, String perfil, String termosTecnicos, String orientacao,
			String procedimentos, String tempo, String indicadores, String relatorioGestao, String normas,
			String recursoDuvida, Long autor) {
		super();
		this.processo = processo;
		this.etapa = etapa;
		this.vigencia = vigencia;
		this.objetivo = objetivo;
		this.campoAplicacao = campoAplicacao;
		this.competencia = competencia;
		this.treinamento = treinamento;
		this.perfil = perfil;
		this.termosTecnicos = termosTecnicos;
		this.orientacao = orientacao;
		this.procedimentos = procedimentos;
		this.tempo = tempo;
		this.indicadores = indicadores;
		this.relatorioGestao = relatorioGestao;
		this.normas = normas;
		this.recursoDuvida = recursoDuvida;
		this.autor = autor;
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

	public String getVigencia() {
		return vigencia;
	}

	public void setVigencia(String vigencia) {
		this.vigencia = vigencia;
	}

	public String getObjetivo() {
		return objetivo;
	}

	public void setObjetivo(String objetivo) {
		this.objetivo = objetivo;
	}

	public String getCampoAplicacao() {
		return campoAplicacao;
	}

	public void setCampoAplicacao(String campoAplicacao) {
		this.campoAplicacao = campoAplicacao;
	}

	public String getCompetencia() {
		return competencia;
	}

	public void setCompetencia(String competencia) {
		this.competencia = competencia;
	}

	public String getTreinamento() {
		return treinamento;
	}

	public void setTreinamento(String treinamento) {
		this.treinamento = treinamento;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}

	public String getTermosTecnicos() {
		return termosTecnicos;
	}

	public void setTermosTecnicos(String termosTecnicos) {
		this.termosTecnicos = termosTecnicos;
	}

	public String getOrientacao() {
		return orientacao;
	}

	public void setOrientacao(String orientacao) {
		this.orientacao = orientacao;
	}

	public String getFluxograma() {
		return fluxograma;
	}

	public void setFluxograma(String fluxograma) {
		this.fluxograma = fluxograma;
	}

	public String getProcedimentos() {
		return procedimentos;
	}

	public void setProcedimentos(String procedimentos) {
		this.procedimentos = procedimentos;
	}

	public String getTempo() {
		return tempo;
	}

	public void setTempo(String tempo) {
		this.tempo = tempo;
	}

	public String getIndicadores() {
		return indicadores;
	}

	public void setIndicadores(String indicadores) {
		this.indicadores = indicadores;
	}

	public String getRelatorioGestao() {
		return relatorioGestao;
	}

	public void setRelatorioGestao(String relatorioGestao) {
		this.relatorioGestao = relatorioGestao;
	}

	public String getNormas() {
		return normas;
	}

	public void setNormas(String normas) {
		this.normas = normas;
	}

	public String getRecursoDuvida() {
		return recursoDuvida;
	}

	public void setRecursoDuvida(String recursoDuvida) {
		this.recursoDuvida = recursoDuvida;
	}	
	

	public Long getAutor() {
		return autor;
	}

	public void setAutor(Long autor) {
		this.autor = autor;
	}

	public String getArquivoComplementar() {
		return arquivoComplementar;
	}

	public void setArquivoComplementar(String arquivoComplementar) {
		this.arquivoComplementar = arquivoComplementar;
	}

	@Override
	public String toString() {
		return "BaseConhecimento [id=" + id + ", processo=" + processo + ", etapa=" + etapa + ", vigencia=" + vigencia
				+ ", objetivo=" + objetivo + ", campoAplicacao=" + campoAplicacao + ", competencia=" + competencia
				+ ", treinamento=" + treinamento + ", perfil=" + perfil + ", termosTecnicos=" + termosTecnicos
				+ ", orientacao=" + orientacao + ", fluxograma=" + fluxograma + ", procedimentos=" + procedimentos
				+ ", tempo=" + tempo + ", indicadores=" + indicadores + ", relatorioGestao=" + relatorioGestao
				+ ", normas=" + normas + ", recursoDuvida=" + recursoDuvida + autor + "]";
	}
	
	
	

}
