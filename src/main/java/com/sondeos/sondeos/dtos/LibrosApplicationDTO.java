package com.sondeos.sondeos.dtos;

public class LibrosApplicationDTO {
    public long id;
    public String titulo;
    public String autor;
    public double precio;
    public String fechaDeLanzamiento;

    public LibrosApplicationDTO() {
    }

    public LibrosApplicationDTO(long id, String titulo, String autor, double precio, String fechaDeLanzamiento) {
        this.id = id;
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
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


