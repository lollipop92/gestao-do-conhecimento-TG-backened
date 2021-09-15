package com.gestaoconhecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoconhecimento.model.Config;

@Repository
public interface ConfigRepository extends JpaRepository<Config, Long> {

}
