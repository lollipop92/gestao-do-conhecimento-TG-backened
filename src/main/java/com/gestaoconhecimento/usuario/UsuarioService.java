package com.gestaoconhecimento.usuario;

import java.io.Console;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {	
	
	private final UsuarioRepository usuarioRepository;
	
	@Autowired
	public UsuarioService(UsuarioRepository usuarioRepository) {
		this.usuarioRepository = usuarioRepository;
	}
	
	// Mostrar todos os usuários
	public List<Usuario> getUsuario() {
		return usuarioRepository.findAll();
				
	}

	//Adicionar usuário verificando se o email já existe
	public void adicionarNovoUsuario(Usuario usuario) {
		
		System.out.println(usuario);
		
		
		Optional<Usuario> usuarioOptional = usuarioRepository.findByEmail(usuario.getEmail());
		if (usuarioOptional.isPresent()) {
			throw new IllegalStateException("Email já existente!");
		}
		usuarioRepository.save(usuario);
		
		
	}

	//Deletar um usuário passando o Id na url e verificando se ele existe
	public void deletarUsuario(Long usuarioId) {
		boolean existe = usuarioRepository.existsById(usuarioId);
		if (!existe) {
			throw new IllegalStateException("Usuário com identificação "+usuarioId+ " não existe.");			
		}
		usuarioRepository.deleteById(usuarioId);
	}

	@Transactional
	public void editarUsuario(Long usuarioId, 
							  String name, 
							  String email,
							  String senha,
							  String setor,
							  String cargo) {
		Usuario usuario = usuarioRepository.findById(usuarioId).orElseThrow(() -> new IllegalStateException(
				"Usuário com identificação "+usuarioId+ " não existe."));
		
		if (name != null && name.length() > 0 && !Objects.equals(usuario.getNome(), name)) {
			usuario.setNome(name);
			}
	
		if (email != null && email.length() > 0 && !Objects.equals(usuario.getEmail(), email)) {
			Optional<Usuario> usuarioOptional = usuarioRepository.findByEmail(email);
			if (usuarioOptional.isPresent()) {
				throw new IllegalStateException("o email já é utilizado.");
				}
			usuario.setEmail(email);
			}
		
		if (senha != null && senha.length() > 0 && !Objects.equals(usuario.getSenha(), senha)) {
			usuario.setSenha(senha);
			}
		
		if (setor != null && setor.length() > 0 && !Objects.equals(usuario.getSetor(), setor)) {
			usuario.setSetor(setor);
			}
		
		if (cargo != null && cargo.length() > 0 && !Objects.equals(usuario.getCargo(), cargo)) {
			usuario.setCargo(cargo);
			}
				
	}

}
