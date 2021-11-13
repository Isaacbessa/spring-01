package com.api.produto.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.api.produto.modelo.ProdutoModelo;

// T = TYPE, um elemento usado para manipular dados, cadastrar ou selecionar
//ID = IDENTIFICADOR, UM CODIGO INT, UMA CHAVE PRIMARIA
public interface ProdutoRepositorio extends CrudRepository<ProdutoModelo, Integer>{
		//Listar todos os produtos
		List<ProdutoModelo> findAll();
		
		// Pesquisar por códigos
		ProdutoModelo findByCodigo(int codigo);
		
		//Remover produto
		void delete(ProdutoModelo produto);
		
		//Cadastrar ou alterar produto
		<ProMod extends ProdutoModelo> ProMod save(ProMod entity);
		
}
