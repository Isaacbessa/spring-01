package com.api.produto.controle;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.produto.modelo.ProdutoModelo;
import com.api.produto.repositorio.ProdutoRepositorio;

@RestController
@RequestMapping("/api")
public class ProdutoControle {
	//@ResponseBody: indicando que um parâmetro de método deve ser associado ao corpo da solicitação HTTP.
	//métodos sendo feitos
		@Autowired
		private ProdutoRepositorio acoes;
	
	

//Listrar produtos

	//Inicio
@RequestMapping(value="/produtos", method=RequestMethod.GET)// get = select
	public @ResponseBody List<ProdutoModelo> listar(){
		return acoes.findAll();
	}
	
		//cadastrar produtos
// criando o método
@RequestMapping(value ="/produtos", method=RequestMethod.POST)
	public @ResponseBody ProdutoModelo cadastrar(@RequestBody ProdutoModelo produto) {
					return acoes.save(produto);	
	}
}
