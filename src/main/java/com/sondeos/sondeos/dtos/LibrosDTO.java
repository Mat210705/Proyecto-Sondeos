package com.sondeos.sondeos.dtos;

import com.sondeos.sondeos.models.Libros;


public class LibrosDTO {
    public long id;
    public String titulo;
    public String autor;
    public double precio;
    public String fechaDeLanzamiento;

    public LibrosDTO() {
    }

    public LibrosDTO(Libros libros) {
        this.id = libros.getId();
        this.titulo = libros.getTitulo();
        this.autor = libros.getAutor();
        this.precio = libros.getPrecio();
        this.fechaDeLanzamiento = libros.getFechaDeLanzamiento();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public void setFechaDeLanzamiento(String fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }
}
