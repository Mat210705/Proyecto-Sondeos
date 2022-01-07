package com.sondeos.sondeos.controllers;

import com.sondeos.sondeos.dtos.LibrosApplicationDTO;
import com.sondeos.sondeos.dtos.LibrosDTO;
import com.sondeos.sondeos.models.Libros;
import com.sondeos.sondeos.repositories.LibrosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;
import java.util.stream.Collectors;

@RestController
public class LibrosController {
    @Autowired
    LibrosRepository librosRepository;

    @GetMapping("/api/libros")
    public List<LibrosDTO> getLibros(){

        return librosRepository.findAll().stream().map(LibrosDTO::new).collect(Collectors.toList());
    }

    @PostMapping("/api/current/libros")
    public ResponseEntity<Object> create(@RequestBody LibrosApplicationDTO librosApplicationDTO) {
        if (librosApplicationDTO.titulo.isEmpty() ||librosApplicationDTO.autor.isEmpty() || librosApplicationDTO.precio == 0 || librosApplicationDTO.fechaDeLanzamiento.isEmpty()) {
            return new ResponseEntity<>("Missing data", HttpStatus.FORBIDDEN);
        }
            Libros newLibro = new Libros(librosApplicationDTO.getTitulo(), librosApplicationDTO.getAutor(), librosApplicationDTO.getPrecio(), librosApplicationDTO.getFechaDeLanzamiento());
            librosRepository.save(newLibro);
            return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/api/libros/delete")
    public ResponseEntity<?> deleteLibros(@RequestParam String titulo){

        Libros libro = librosRepository.findByTitulo(titulo);

        librosRepository.delete(librosRepository.findByTitulo(titulo));

        return new ResponseEntity<>("Libro Eliminado Correctamente", HttpStatus.ACCEPTED);
    }
    @PutMapping("/api/libros/update")
    public ResponseEntity<?> updateLibrosApplicationDTO(@RequestBody LibrosApplicationDTO librosApplicationDTO){

        Libros libros = librosRepository.findById(librosApplicationDTO.getId());
        libros.setAutor(librosApplicationDTO.getAutor());
        libros.setTitulo(librosApplicationDTO.getTitulo());
        libros.setPrecio(librosApplicationDTO.getPrecio());
        libros.setFechaDeLanzamiento(librosApplicationDTO.getFechaDeLanzamiento());
        librosRepository.save(libros);


        return new ResponseEntity<>("Libro Actualizado Correctamente", HttpStatus.ACCEPTED);
    }

}
