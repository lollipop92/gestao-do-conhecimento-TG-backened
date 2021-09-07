package com.gestaoconhecimento.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.gestaoconhecimento.model.Usuario;


@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long>{
		
	@Query("SELECT s FROM Usuario s WHERE s.email = ?1")
	Optional<Usuario> findByEmail2(String email);
	
	//@Query("SELECT s FROM Usuario s WHERE s.email = ?1")
	//Usuario findByEmail2(String email);
	
	public Usuario findByEmail(String email);
	public Usuario findByEmailAndSenha(String email, String senha);
	
	

}
