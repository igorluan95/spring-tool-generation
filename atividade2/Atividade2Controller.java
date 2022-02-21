package com.generation.atividade2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade2")

public class Atividade2Controller {
	
	@GetMapping
	
	public String atividade2 () {
	return "<h1>Objetivos de aprendizagem para essa semana:</h1>" +
            "<ul><li>Aprender mais sobre MySQL e Spring-Tool.</li></ul>";
                 
			
	}

}
