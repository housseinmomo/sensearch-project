package com.mugen.sensearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SensearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(SensearchApplication.class, args);

		System.out.println("Bienvenue sur Sensearch");
	}

}
