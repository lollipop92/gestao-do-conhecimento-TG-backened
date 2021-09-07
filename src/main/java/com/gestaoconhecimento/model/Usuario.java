package com.gestaoconhecimento.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import net.bytebuddy.implementation.bytecode.assign.reference.GenericTypeAwareAssigner;

@Entity
@Table
public class Usuario implements Serializable{

//	private static final long serialVersionUID = 1L;
	
	@Id
	@SequenceGenerator(
			name = "usuario_sequence",
			sequenceName = "usuario_sequence",
			allocationSize = 1
			)
	@GeneratedValue(
			strategy = GenerationType.SEQUENCE,
			generator = "usuario_sequence"
			)
	private Long id;
	private String nome;
	private String email;
	private String senha;
	private String setor;
	private String cargo;

	public Usuario() {
		super();
		
	}

	public Usuario(Long id, String nome, String email, String senha, String setor, String cargo) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.setor = setor;
		this.cargo = cargo;
	}

	public Usuario(String nome, String email, String senha, String setor, String cargo) {
		super();
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.setor = setor;
		this.cargo = cargo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", email=" + email + ", senha=" + senha + ", setor=" + setor
				+ ", cargo=" + cargo + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(id, other.id);
	}

}
