package com.generation.blogpessoal.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.generation.blogpessoal.model.PostagemModel;

@Repository
    public interface PostagemRepository extends JpaRepository<PostagemModel, Long> {
    public List<PostagemModel> findAllByTituloContainingIgnoreCase (String titulo);
    public List<PostagemModel> findAllByTextoContainingIgnoreCase (String texto);

}
