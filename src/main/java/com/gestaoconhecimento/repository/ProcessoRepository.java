package com.gestaoconhecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoconhecimento.model.Processo;

@Repository
public interface ProcessoRepository extends JpaRepository<Processo, Long>{

}
