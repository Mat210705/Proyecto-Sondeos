package com.sondeos.sondeos;

import com.sondeos.sondeos.models.Libros;
import com.sondeos.sondeos.repositories.LibrosRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class SondeosApplication {

	public static void main(String[] args) {

		SpringApplication.run(SondeosApplication.class, args);
	}
	@Bean
	public CommandLineRunner initData(LibrosRepository librosRepository) {
		return (args) -> {
			Libros libro1 = new Libros( "El Conde de Montecristo", "Alejandro Dumas", 11.000, "15 de Enero de 1846");
			librosRepository.save(libro1);
		};
	}
}
