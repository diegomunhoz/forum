package br.com.foursys.forum.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.foursys.forum.controller.dto.UsuarioDto;
import br.com.foursys.forum.model.Usuario;
import br.com.foursys.forum.repository.UsuarioRepository;

/**
 * Classe responsável por controlar os processos de tópicos do forum de duvidas
 * 
 * @author Diego Munhoz
 * @since 17/05/2021
 * @version 1.0
 */
@RestController
public class UsuarioController {

	@Autowired
	private UsuarioRepository usuarioRepository;

	@RequestMapping("/usuarios")
	public List<UsuarioDto> lista() {
		List<Usuario> usuarios = usuarioRepository.findAll();
		return UsuarioDto.converter(usuarios);
	}

}
