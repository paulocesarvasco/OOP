package com.unicamp.mc322.lab04;

public class User {

	private String nome;
	private String cpf;
	private int endereco[] = new int[2];
	private int pedidos = 0;
	
	// Construtor
	public User(String nome, String cpf, int X, int Y) {
		this.nome = nome;
		this.cpf = cpf;
		this.endereco[0] = X;
		this.endereco[1] = Y;
	}
	
	public int getPedidos() {
		return this.pedidos;
	}
	
	public void incrementarPedido() {
		this.pedidos += 1;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
}
