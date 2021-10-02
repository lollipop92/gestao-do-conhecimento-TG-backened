package com.gestaoconhecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoconhecimento.model.ProcessoEtapa;

@Repository
public interface ProcessoEtapaRepository extends JpaRepository<ProcessoEtapa,Long> {

}
