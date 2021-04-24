package com.unicamp.mc322.lab04;

public class Lanche {

	private String identificador;
	private String nome;
	private double preco;
	private double precoDesconto = -1; // Valor dummy indicando que o desconto não foi aplicado
	
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
	
	public void setDescontoPorcentagem(double desconto) {
		// Converte inteiro para porcentagem
		desconto = (1 - desconto/100);
		this.precoDesconto = this.preco*desconto;
	}
	
	public void setDescontoFixo(double desconto) {
		this.precoDesconto = this.preco - desconto;
		if (this.precoDesconto < 0) {
			this.precoDesconto = 0;
		}
	}
	
	public void removerDesconto() {
		this.precoDesconto = -1;
	}
	
	public double getPreco() {
		
		double preco;
		if (this.precoDesconto > 0) {
			preco = this.precoDesconto;
		} else {
			preco = this.preco;
		}
		return preco;
	}
	
	public void imprimirInfo() {
		System.out.printf("[%s] %s ", this.identificador, this.nome);
		if (this.precoDesconto < 0) {
			System.out.printf("R$ %.2f\n", this.preco);
		} else {
			System.out.printf("R$ %.2f (PROMOCAO! PRECO NORMAL: R$ %.2f)\n", this.precoDesconto, this.preco);
		}
	}
}
