package com.aluracursos.desafioliteratura;

import com.aluracursos.desafioliteratura.principal.Principal;
import com.aluracursos.desafioliteratura.repository.iAutorRepository;
import com.aluracursos.desafioliteratura.repository.iLibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesafioliteraturaApplication implements CommandLineRunner {

	@Autowired
	private iLibroRepository libroRepository;

	@Autowired
	private iAutorRepository autorRepository;

	public static void main(String[] args) {
		SpringApplication.run(DesafioliteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Principal principal = new Principal(libroRepository,autorRepository);
		principal.consumo();
	}
}
