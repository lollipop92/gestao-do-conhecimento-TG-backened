package com.gestaoconhecimento.usuario;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//Resources para API

@RestController
@RequestMapping(path = "api/v1/usuario")
public class UsuarioController {

	private final UsuarioService usuarioService;

	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	@CrossOrigin("http://localhost:8050/api/v1/usuario")
	@GetMapping
	public List<Usuario> getUsuario() {
		return usuarioService.getUsuario();

	}
	
	@CrossOrigin("http://localhost:8050/api/v1/usuario")
	@PostMapping
	public void registrarNovoUsuario(@RequestBody Usuario usuario) {
		usuarioService.adicionarNovoUsuario(usuario);
	}
	
	@CrossOrigin("http://localhost:8050/api/v1/usuario")
	@DeleteMapping(path = "{usuarioId}")
	public void deletarUsuario(@PathVariable("usuarioId") Long usuarioId) {
		usuarioService.deletarUsuario(usuarioId);
	}
	
	@CrossOrigin("http://localhost:8050/api/v1/usuario")
	@PutMapping(path = "{usuarioId}")
	public void editarUsuario(
			@PathVariable("usuarioId") Long usuarioId,
			@RequestParam(required = false) String nome,
			@RequestParam(required = false) String email,
			@RequestParam(required = false) String senha,
			@RequestParam(required = false) String setor,
			@RequestParam(required = false) String cargo) {
		
		usuarioService.editarUsuario(usuarioId, nome, email, senha, setor, cargo);
		
	}
	
	
}
