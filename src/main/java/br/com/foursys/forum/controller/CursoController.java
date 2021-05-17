package br.com.foursys.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.foursys.forum.controller.dto.CursoDto;
import br.com.foursys.forum.model.Curso;
import br.com.foursys.forum.repository.CursoRepository;

/**
 * Classe responsável por controlar os processos de tópicos do forum de duvidas
 * 
 * @author Diego Munhoz
 * @since 17/05/2021
 * @version 1.0
 */
@RestController
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;

	@RequestMapping("/cursos")
	public List<CursoDto> lista() {
		List<Curso> cursos = cursoRepository.findAll();
		return CursoDto.converter(cursos);
	}

}
