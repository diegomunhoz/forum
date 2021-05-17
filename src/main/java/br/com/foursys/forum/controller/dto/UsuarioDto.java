package br.com.foursys.forum.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.foursys.forum.model.Usuario;

/**
 * Classe responsável por armazenar atributos devolvidos nas requisições
 * 
 * @author Diego Munhoz
 * @since 17/05/2021
 * @version 1.0
 */
public class UsuarioDto {

	private Long id;
	private String nome;
	private String email;

	public UsuarioDto(Usuario usuario) {
		this.id = usuario.getId();
		this.nome = usuario.getNome();
		this.email = usuario.getEmail();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getEmail() {
		return email;
	}

	public static List<UsuarioDto> converter(List<Usuario> usuarios) {
		return usuarios.stream().map(UsuarioDto::new).collect(Collectors.toList());
	}

}
