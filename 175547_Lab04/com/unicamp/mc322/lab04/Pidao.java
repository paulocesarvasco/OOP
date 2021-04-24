package com.unicamp.mc322.lab04;

import java.util.ArrayList;
import java.util.List;

public class Pidao {

	private String nome;
	private String cnpj;
	private int endereco[] = new int[2];
	
	// Lista que armezena todos usuarios cadastrados no app
	private List<User> users = new ArrayList<User>();
	// Lista com o nome de todos os lanches adicionados
	private List<Lanche> cardapio = new ArrayList<Lanche>();
	
	// Construtor
	public Pidao(String nome, String cnpj, int X, int Y) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco[0] = X;
		this.endereco[1] = Y;
	}
	
	public User cadastrarUsuario(String nome, String cpf, int X, int Y) {
		User newUser = new User(nome, cpf, X, Y);
		this.users.add(newUser);
		return newUser;
	}
	
	public void adicionarAoCardapio(Lanche lanche) {
		this.cardapio.add(lanche);
	}
	
	public void aplicarDesconto(String identificador, double porcentagem, TipoDesconto desconto) {
		
		Lanche item = buscarItem(identificador);
		if (item == null) {
			return;
		}
		switch (desconto) {
		case PORCENTAGEM:
			item.setDesconto(porcentagem);
			break;
		case REMOVERDESCONTO:
			item.removerDesconto();
			break;
		default:
			break;
		}
	}
	
	private Lanche buscarItem(String identificador) {
		
		Lanche itemEncontrado = null;
		
		for (Lanche item : this.cardapio) {
			if (item.getIdentificador().equals(identificador) ) {
				itemEncontrado = item;
			}
		}
		return itemEncontrado;
	}
}
