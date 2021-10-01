package com.gestaoconhecimento.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestaoconhecimento.model.Processo;
import com.gestaoconhecimento.model.Usuario;
import com.gestaoconhecimento.repository.ProcessoRepository;

@Service
public class ProcessoService {

	private final ProcessoRepository processoRepository;
	
	@Autowired
	public ProcessoService(ProcessoRepository processoRepository) {
		this.processoRepository = processoRepository;
	}

	public List<Processo> getProcessos() {
		
		return processoRepository.findAll();
	}

	public Processo getProcesso(Long processoId) {
		
		Processo processo = processoRepository.findById(processoId).orElseThrow(() -> new IllegalStateException(
				"Processo com identificação "+processoId+ " não existe."));
		return processo;
	}

	public void registrarProcesso(Processo processo) {
		processoRepository.save(processo);
		
	}

	public void editarBaseConhecimento(Long processoId, String processo, String etapa, Long treinador, Long treinado,
			String data, String status, int etapaIndice, String etapa1, String etapa2, String etapa3, String etapa4) {
		
		Processo processoAprendizagem = processoRepository.findById(processoId).orElseThrow(() -> new IllegalStateException( "Processo com identificação "+processoId+ " não existe."));
		
		if (processo != null && processo.length() > 0 && !Objects.equals(processoAprendizagem.getProcesso(), processo)) {
			processoAprendizagem.setProcesso(processo);
		}
		if (etapa != null && etapa.length() > 0 && !Objects.equals(processoAprendizagem.getEtapa(), etapa)) {
			processoAprendizagem.setEtapa(etapa);
		}
		if (treinador != null && !Objects.equals(processoAprendizagem.getTreinador(), treinador)) {
			processoAprendizagem.setTreinador(treinador);
		}
		if (treinado != null && !Objects.equals(processoAprendizagem.getTreinado(), treinado)) {
			processoAprendizagem.setTreinado(treinado);
		}
		if (data != null && data.length() > 0 && !Objects.equals(processoAprendizagem.getData(), data)) {
			processoAprendizagem.setData(data);
		}		
		if (status != null && status.length() > 0 && !Objects.equals(processoAprendizagem.getStatus(), status)) {
			processoAprendizagem.setStatus(status);
		}	
		if (etapaIndice != 0 &&  !Objects.equals(processoAprendizagem.getEtapaIndice(), etapaIndice)) {
			processoAprendizagem.setEtapaIndice(etapaIndice);
		}			
		if (etapa1 != null && etapa1.length() > 0 && !Objects.equals(processoAprendizagem.getEtapa1(), etapa1)) {
			processoAprendizagem.setEtapa1(etapa1);
		}		
		if (etapa2 != null && etapa2.length() > 0 && !Objects.equals(processoAprendizagem.getEtapa2(), etapa2)) {
			processoAprendizagem.setEtapa2(etapa2);
		}				
		if (etapa3 != null && etapa3.length() > 0 && !Objects.equals(processoAprendizagem.getEtapa3(), etapa3)) {
			processoAprendizagem.setEtapa3(etapa3);
		}	
		if (etapa4 != null && etapa4.length() > 0 && !Objects.equals(processoAprendizagem.getEtapa4(), etapa4)) {
			processoAprendizagem.setEtapa4(etapa4);
		}	
	
	}
}
		
	
		
