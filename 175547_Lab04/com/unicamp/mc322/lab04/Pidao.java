package com.unicamp.mc322.lab04;

public class Pidao {

	private String nome;
	private String cnpj;
	private int endereco[] = new int[2];
	
	// Construtor
	public Pidao(String nome, String cnpj, int X, int Y) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco[0] = X;
		this.endereco[1] = Y;
	}
}
