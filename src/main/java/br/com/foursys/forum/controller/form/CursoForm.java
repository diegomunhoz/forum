package br.com.foursys.forum.controller.form;

import br.com.foursys.forum.model.Curso;

public class CursoForm {

	private String nome;
	private String categoria;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Curso converter() {
		return new Curso(nome, categoria);
	}

}
