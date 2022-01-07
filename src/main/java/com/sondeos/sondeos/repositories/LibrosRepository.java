package com.sondeos.sondeos.repositories;

import com.sondeos.sondeos.dtos.LibrosDTO;
import com.sondeos.sondeos.models.Libros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface LibrosRepository extends JpaRepository <Libros, Long> {
    Libros findById(long id);
    Libros findByTitulo(String titulo);
}
