package br.com.foursys.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.foursys.forum.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
