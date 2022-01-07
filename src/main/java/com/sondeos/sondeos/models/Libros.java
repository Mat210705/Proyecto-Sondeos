package com.sondeos.sondeos.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Libros {
    @Id
    @GenericGenerator(name ="native", strategy = "native")
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")

    public long id;
    public String titulo;
    public String autor;
    public double precio;
    public String fechaDeLanzamiento;

    public Libros() {
    }

    public Libros(String titulo, String autor, double precio, String fechaDeLanzamiento) {
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
