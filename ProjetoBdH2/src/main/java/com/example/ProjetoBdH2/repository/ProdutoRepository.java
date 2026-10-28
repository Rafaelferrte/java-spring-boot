package com.example.ProjetoBdH2.repository;


import com.example.ProjetoBdH2.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
