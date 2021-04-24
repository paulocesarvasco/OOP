package com.unicamp.mc322.lab04;

public class Lanche {

	private String identificador;
	private String nome;
	private double preco;
	private double precoDesconto = 0;
	
	// Construtor
	public Lanche(String identificador, String nome, double preco) {
		this.identificador = identificador;
		this.nome = nome;
		this.preco = preco;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getIdentificador() {
		return this.identificador;
	}
	
	public void setDesconto(double desconto) {
		// Converte inteiro para porcentagem
		desconto = (1 - desconto/100);
		this.precoDesconto = this.preco*desconto;
	}
	
	public void removerDesconto() {
		this.precoDesconto = 0;
	}
}
