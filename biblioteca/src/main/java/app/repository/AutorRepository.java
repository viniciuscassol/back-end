package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import app.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Long> {
				
}
