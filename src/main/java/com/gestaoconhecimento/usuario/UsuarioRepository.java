package com.gestaoconhecimento.usuario;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
		
	@Query("SELECT s FROM Usuario s WHERE s.email = ?1")
	Optional<Usuario> findByEmail(String email);

}
