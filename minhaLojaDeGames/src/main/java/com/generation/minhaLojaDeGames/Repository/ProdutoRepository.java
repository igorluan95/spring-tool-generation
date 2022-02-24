package com.generation.minhaLojaDeGames.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.minhaLojaDeGames.Model.ProdutoModel;

@Repository
public interface ProdutoRepository extends JpaRepository <ProdutoModel, Long>{  
	                                                                                
	public List <ProdutoModel> findAllByTituloContainingIgnoreCase(String titulo);
	
			

}
