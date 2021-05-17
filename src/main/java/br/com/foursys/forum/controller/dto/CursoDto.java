package br.com.foursys.forum.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.foursys.forum.model.Curso;

/**
 * Classe responsável por armazenar atributos devolvidos nas requisições
 * 
 * @author Diego Munhoz
 * @since 17/05/2021
 * @version 1.0
 */
public class CursoDto {

	private Long id;
	private String nome;
	private String categoria;

	public CursoDto(Curso curso) {
		this.id = curso.getId();
		this.nome = curso.getNome();
		this.categoria = curso.getCategoria();
	}

	public Long getId() {
		return id;
	}

	public String getNome() {
		return nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public static List<CursoDto> converter(List<Curso> cursos) {
		return cursos.stream().map(CursoDto::new).collect(Collectors.toList());
	}

}
