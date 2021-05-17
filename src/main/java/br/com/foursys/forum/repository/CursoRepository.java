package br.com.foursys.forum.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.foursys.forum.model.Curso;

public interface CursoRepository extends JpaRepository<Curso, Long> {

}
