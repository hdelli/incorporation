package com.incorporation.incorporation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class IncorporationApplication {

	public static void main(String[] args) {
		SpringApplication.run(IncorporationApplication.class, args);
	}
	@Bean
	CommandLineRunner commandLineRunner(StudentRepository repository) {
		return args -> {
			Student hajr = new Student("Hajr", "Delli", "hajr@hotmail.com", 12);
			Student suad = new Student("Suad", "Ali", "SuadALi97@Hotmail.com", 12);
			repository.saveAll(List.of(hajr, suad));
		};

	}
}
