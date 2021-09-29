package com.gestaoconhecimento.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaoconhecimento.repository.BaseConhecimentoRepository;
import com.gestaoconhecimento.model.BaseConhecimento;

@Service
public class BaseConhecimentoService {
	
	private final BaseConhecimentoRepository baseConhecimentoRepository;
	
	@Autowired
	public BaseConhecimentoService(BaseConhecimentoRepository baseConhecimentoRepository) {
		this.baseConhecimentoRepository = baseConhecimentoRepository;
	}

	public List<BaseConhecimento> getBasesConhecimento() {
		
		return baseConhecimentoRepository.findAll();
	}

	public void registrarBaseConhecimento(BaseConhecimento baseConhecimento) {
		baseConhecimentoRepository.save(baseConhecimento);
		
	}

	public void editarBaseConhecimento(Long baseConhecimentoId, String processo, String etapa, String vigencia,
			String objetivo, String campoAplicacao, String competencia, String treinamento, String perfil,
			String termosTecnicos, String orientacao, String procedimentos, String tempo, String indicadores,
			String relatorioGestao, String normas, String recursoDuvida, Long autor) {
		
		BaseConhecimento baseConhecimento = baseConhecimentoRepository.findById(baseConhecimentoId).orElseThrow(() -> new IllegalStateException( "Base de conhecimento com identificação "+baseConhecimentoId+ " não existe."));
		
		if (processo != null && processo.length() > 0 && !Objects.equals(baseConhecimento.getProcesso(), processo)) {
			baseConhecimento.setProcesso(processo);
			}
		if (etapa != null && etapa.length() > 0 && !Objects.equals(baseConhecimento.getEtapa(), etapa)) {
			baseConhecimento.setEtapa(etapa);
			}
		if (vigencia != null && vigencia.length() > 0 && !Objects.equals(baseConhecimento.getVigencia(), vigencia)) {
			baseConhecimento.setVigencia(vigencia);
			}
		if (objetivo != null && objetivo.length() > 0 && !Objects.equals(baseConhecimento.getObjetivo(), objetivo)) {
			baseConhecimento.setObjetivo(objetivo);
			}
		if (campoAplicacao != null && campoAplicacao.length() > 0 && !Objects.equals(baseConhecimento.getCampoAplicacao(), campoAplicacao)) {
			baseConhecimento.setCampoAplicacao(campoAplicacao);
			}
		if (competencia != null && competencia.length() > 0 && !Objects.equals(baseConhecimento.getCompetencia(), competencia)) {
			baseConhecimento.setCompetencia(competencia);
			}
		if (treinamento != null && treinamento.length() > 0 && !Objects.equals(baseConhecimento.getTreinamento(), treinamento)) {
			baseConhecimento.setTreinamento(treinamento);
			}
		if (perfil != null && perfil.length() > 0 && !Objects.equals(baseConhecimento.getPerfil(), perfil)) {
			baseConhecimento.setPerfil(perfil);
			}
		if (termosTecnicos != null && termosTecnicos.length() > 0 && !Objects.equals(baseConhecimento.getTermosTecnicos(), termosTecnicos)) {
			baseConhecimento.setTermosTecnicos(termosTecnicos);
			}
		if (orientacao != null && orientacao.length() > 0 && !Objects.equals(baseConhecimento.getOrientacao(), orientacao)) {
			baseConhecimento.setOrientacao(orientacao);
			}
		if (procedimentos != null && procedimentos.length() > 0 && !Objects.equals(baseConhecimento.getProcedimentos(), procedimentos)) {
			baseConhecimento.setProcedimentos(procedimentos);
			}
		if (tempo != null && tempo.length() > 0 && !Objects.equals(baseConhecimento.getTempo(), tempo)) {
			baseConhecimento.setTempo(tempo);
			}
		if (indicadores != null && indicadores.length() > 0 && !Objects.equals(baseConhecimento.getIndicadores(), indicadores)) {
			baseConhecimento.setIndicadores(indicadores);
			}
		if (relatorioGestao != null && relatorioGestao.length() > 0 && !Objects.equals(baseConhecimento.getRelatorioGestao(), relatorioGestao)) {
			baseConhecimento.setRelatorioGestao(relatorioGestao);
			}
		if (normas != null && normas.length() > 0 && !Objects.equals(baseConhecimento.getNormas(), normas)) {
			baseConhecimento.setNormas(normas);
			}
		if (recursoDuvida != null && recursoDuvida.length() > 0 && !Objects.equals(baseConhecimento.getRecursoDuvida(), recursoDuvida)) {
			baseConhecimento.setRecursoDuvida(recursoDuvida);
			}
		
		
	}

}
