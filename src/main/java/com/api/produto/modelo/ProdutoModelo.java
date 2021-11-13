package com.api.produto.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity // UMA ANOTAÇÃO QUE IRÁ ESTABELECER A LIGAÇÃO ENTRE A ENTIDADE E A TABELA NO BANCO DE DADOS
@Table(name="produtos")
public class ProdutoModelo {
	
	
	//3 atribuitos e criações de colunas
// implementando os ID
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigo")
	private int codigo;
	
	
	@Column(name="nome")
	private String nome;
	
	@Column(name="valor")
	private double valor;
	
	//GET E SETTERS
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	
}
