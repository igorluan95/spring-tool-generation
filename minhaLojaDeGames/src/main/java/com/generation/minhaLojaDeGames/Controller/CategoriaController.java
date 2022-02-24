package com.generation.minhaLojaDeGames.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.minhaLojaDeGames.Model.CategoriaModel;
import com.generation.minhaLojaDeGames.Repository.CategoriaRepository;

@RestController
@CrossOrigin(origins = "*", allowedHeaders= "*" )
@RequestMapping("/descricao")

public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> getAll() {
	    return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}") 
	public ResponseEntity<CategoriaModel> getById(@PathVariable Long id) {
	    return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
	                 .orElse(ResponseEntity.notFound().build());

	}
	
	@GetMapping("/descricao{descricao}")
	public ResponseEntity<List<CategoriaModel>> getByDescricao(@PathVariable String descricao) {
	    return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));

	}
	
	@PostMapping
	public ResponseEntity<CategoriaModel> post (@RequestBody CategoriaModel categoria) {
	    return ResponseEntity.status(HttpStatus.CREATED)
	    .body(repository.save(categoria));
	}
	
	@PutMapping
	public ResponseEntity<CategoriaModel> put (@RequestBody CategoriaModel categoria) {
	    return ResponseEntity.ok(repository.save(categoria));

	}
	
	
	
	
}
