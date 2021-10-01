package com.gestaoconhecimento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestaoconhecimento.model.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo,Long> {

}
