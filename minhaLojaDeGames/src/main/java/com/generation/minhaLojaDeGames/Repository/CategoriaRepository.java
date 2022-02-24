package com.generation.minhaLojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.minhaLojaDeGames.Model.CategoriaModel;



@Repository
public interface CategoriaRepository extends JpaRepository <CategoriaModel, Long>{  
	                                                                                   
	public List <CategoriaModel> findAllByDescricaoContainingIgnoreCase(String descricao);
			
	
}
