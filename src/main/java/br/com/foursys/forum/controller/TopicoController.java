package br.com.foursys.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.foursys.forum.controller.dto.TopicoDto;
import br.com.foursys.forum.model.Topico;
import br.com.foursys.forum.repository.TopicoRepository;

/**
 * Classe responsável por controlar os processos de tópicos do forum de duvidas
 * 
 * @author Diego Munhoz
 * @since 17/05/2021
 * @version 1.0
 */
@RestController
public class TopicoController {
	
	@Autowired
	private TopicoRepository topicoRepository;

	@RequestMapping("/topicos")
	public List<TopicoDto> lista(String nomeCurso){
		if (nomeCurso == null) {
			List<Topico> topicos = topicoRepository.findAll();
			return TopicoDto.converter(topicos);
		}else {
			List<Topico> topicos = topicoRepository.findByCursoNome(nomeCurso);
			return TopicoDto.converter(topicos);
		}
		
	}
	
}
