package com.unicamp.mc322.lab06.midias;

public abstract class Midia {

	private String nome;
	private double duracao;
	private String autor;
	private double espaco;
	
	public Midia (String nome, double duracao, String autor) {
		this.nome = nome;
		this.duracao = duracao;
		this.autor = autor;
		this.espaco = calcularArmazenamento(duracao);
	}
	
	public abstract double calcularArmazenamento(double duracao);

}
