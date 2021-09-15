package com.gestaoconhecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoconhecimento.model.Logs;

@Repository
public interface LogsRepository extends JpaRepository<Logs,Long> {

}
