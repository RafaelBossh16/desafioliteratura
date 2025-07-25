package com.aluracursos.desafioliteratura.repository;

import com.aluracursos.desafioliteratura.model.Autor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface iAutorRepository extends JpaRepository<Autor, Long> {

    List<Autor> findAll();

    List<Autor> findByAnioNacimientoLessThanOrAnioFallecimientoGreaterThanEqual(int anioBuscado1, int anioBuscado2);

    Optional<Autor> findFirstByNombreContainsIgnoreCase(String escritor);
}
