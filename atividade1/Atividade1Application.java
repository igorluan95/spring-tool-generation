package com.generation.atividade1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication (exclude = {DataSourceAutoConfiguration.class})



public class Atividade1Application {

	public static void main(String[] args) {
		
		SpringApplication.run(Atividade1Application.class, args);
	}
	
}
