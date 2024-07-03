package com.prova.CRUD.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prova.CRUD.model.produto.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
