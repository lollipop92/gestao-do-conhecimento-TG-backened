package com.gestaoconhecimento.usuario;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
	
	
	
/**	private final UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
**/	
	
	public List<Usuario> getUsuario() {
		return List.of(new Usuario(
				1L,
				"nome",
				"email",
				"senha",
				"cargo",
				"setor"
				));
				
	}

}
