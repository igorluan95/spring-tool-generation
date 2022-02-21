package com.generation.atividade2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})



public class Atividade2Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Atividade2Application.class, args);
	}
	
}
