package com.gestaoconhecimento.controller;

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
import org.springframework.web.bind.annotation.RestController;

import com.gestaoconhecimento.model.Usuario;
import com.gestaoconhecimento.service.UsuarioService;

//Resources para API

@CrossOrigin("*")
@RestController
@RequestMapping(path = "api/v1")
public class UsuarioController {

	private final UsuarioService usuarioService;

	@Autowired
	public UsuarioController(UsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
	
	@GetMapping("/usuarios")
	public List<Usuario> getUsuarios() {
		return usuarioService.getUsuarios();

	}
	
	@GetMapping(path = "{usuarioId}")
	public Usuario getUsuario(@PathVariable("usuarioId") Long usuarioId) {
		return usuarioService.getUsuario(usuarioId);

	}
	
	
	@PostMapping
	public void registrarNovoUsuario(@RequestBody Usuario usuario) {
		usuarioService.adicionarNovoUsuario(usuario);		
	}
	
	//segundo tutorial Registrar 
	@PostMapping("/registrar")
	public Usuario registrarNovoUsuario2(@RequestBody Usuario usuario) throws Exception {
		String emailTemporario = usuario.getEmail();
		if(emailTemporario !=null && !"".equals(emailTemporario)) {
			Usuario usuarioObj = usuarioService.selecionarUsuarioPorEmail(emailTemporario);
			if(usuarioObj != null) {
				throw new Exception("Email "+emailTemporario+ " já cadastrado, favor realizar login.");
			}
		}		
		
		Usuario usuarioObj = null;
		usuarioObj = usuarioService.adicionarNovoUsuario(usuario);
		return usuarioObj;
	}
	
	//segundo tutorial realizarLogin
	@PostMapping("/login")
	public Usuario realizarLogin(@RequestBody Usuario usuario) throws Exception {
		String emailTemporario = usuario.getEmail();
		String senhaTemporario = usuario.getSenha();
		Usuario usuarioObj = null;
		if(emailTemporario != null && senhaTemporario != null) {
			usuarioObj = usuarioService.selecionarUsuarioPorEmailSenha(emailTemporario, senhaTemporario);			
		}
		if (usuarioObj == null) {
			throw new Exception("Email e senha inválidos. Favor verificar suas informações.");
		}
		return usuarioObj;
	}
	
	
	@DeleteMapping(path = "{usuarioId}")
	public void deletarUsuario(@PathVariable("usuarioId") Long usuarioId) {
		usuarioService.deletarUsuario(usuarioId);
	}
	
	/**
	// versão edição com dados na URL
	@PutMapping(path = "{usuarioId}")
	public void editarUsuario(
			@PathVariable("usuarioId") Long usuarioId,
			@RequestParam(required = false) String nome,
			@RequestParam(required = false) String email,
			@RequestParam(required = false) String senha,
			@RequestParam(required = false) String setor,
			@RequestParam(required = false) String cargo) {
		
		usuarioService.editarUsuario(usuarioId, nome, email, senha, setor, cargo);
		
	}**/
	
	// versão edição com dados dados no body
	// numero 2
	@PutMapping(path = "{usuarioId}")
	public void editarUsuario(
			@PathVariable("usuarioId") Long usuarioId,@RequestBody Usuario usuario
			) {
		
		usuarioService.editarUsuario(usuarioId, usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getSetor(), usuario.getCargo());
		
	}
	
}
