package com.gestaoconhecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoconhecimento.model.BaseConhecimento;

@Repository
public interface BaseConhecimentoRepository extends JpaRepository<BaseConhecimento, Long>{

}
