package com.unicamp.mc322.lab13.models;

import com.unicamp.mc322.lab13.exceptions.CreateOrderException;

public class User {

	private String nome;
	private String cpf;
	private int idade;
	
	public User(String nome, String cpf, int idade) {
		if (idade < 16) {
			throw new CreateOrderException("Para fazer um pedido é necessario ser maior de 16 anos.");
		}
		if (nome.isBlank() || nome.isEmpty()) {
			throw new CreateOrderException("Nome de usuario invalido");
		}
		if (cpf.isBlank() || cpf.isEmpty()) {
			throw new CreateOrderException("CPF invalido");
		}
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void printInfos() {
		System.out.printf("Nome: %s, Cpf: %s, Idade: %d\n", nome, cpf, idade);
	}
}
