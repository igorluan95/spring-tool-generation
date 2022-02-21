package com.generation.atividade1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/atividade1")

public class Atividade1Controller {
	
	@GetMapping
	
	public String atividade1 () {
	return "<h1>Habilidades e Mentalidades para realizar essa tarefa:</h1>" +	
            "<ul><li>Orientação ao detalhe, persistência e responsabilidade pessoal.</li></ul>";
                 
			
	}

}
