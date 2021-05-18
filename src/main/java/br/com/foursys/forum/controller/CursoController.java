package br.com.foursys.forum.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import br.com.foursys.forum.controller.dto.CursoDto;
import br.com.foursys.forum.controller.form.CursoForm;
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
@RequestMapping("/cursos")
public class CursoController {

	@Autowired
	private CursoRepository cursoRepository;

	@GetMapping
	public List<CursoDto> lista() {
		List<Curso> cursos = cursoRepository.findAll();
		return CursoDto.converter(cursos);
	}
	
	@PostMapping
	public ResponseEntity<CursoDto> cadastrar(@RequestBody CursoForm form, UriComponentsBuilder uriBuilder) {
		Curso curso = form.converter();
		cursoRepository.save(curso);

		URI uri = uriBuilder.path("/cursos/{id}").buildAndExpand(curso.getId()).toUri();
		return ResponseEntity.created(uri).body(new CursoDto(curso));
	}


}
