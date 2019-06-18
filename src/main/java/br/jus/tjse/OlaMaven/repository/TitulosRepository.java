package br.jus.tjse.OlaMaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import br.jus.tjse.OlaMaven.model.Titulo;

public interface TitulosRepository extends JpaRepository<Titulo, Long> {

}
