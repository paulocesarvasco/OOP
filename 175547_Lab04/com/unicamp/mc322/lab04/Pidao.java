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
	// Lista com o nome de todos os pedidos realizados
	private List<Pedido> pedidos = new ArrayList<Pedido>();
	
	// Construtor
	public Pidao(String nome, String cnpj, int X, int Y) {
		this.nome = nome;
		this.cnpj = cnpj;
		this.endereco[0] = X;
		this.endereco[1] = Y;
	}
	
	// Buscar um item na lista de itens registrados, retorna null se nada foi encontrado
	private Lanche buscarItem(String identificador) {
		
		Lanche itemEncontrado = null;
		
		for (Lanche item : this.cardapio) {
			if (item.getIdentificador().equals(identificador) ) {
				itemEncontrado = item;
			}
		}
		return itemEncontrado;
	}
	
	public User cadastrarUsuario(String nome, String cpf, int X, int Y) {
		User newUser = new User(nome, cpf, X, Y);
		this.users.add(newUser);
		return newUser;
	}
	
	public void adicionarAoCardapio(Lanche lanche) {
		this.cardapio.add(lanche);
	}
	
	public void aplicarDesconto(String identificador, double valorDesconto, TipoDesconto desconto) {
		
		Lanche item = buscarItem(identificador);
		if (item == null) {
			return;
		}
		switch (desconto) {
		case FIXO:
			item.setDescontoFixo(valorDesconto);
		case PORCENTAGEM:
			item.setDescontoPorcentagem(valorDesconto);
			break;
		case REMOVERDESCONTO:
			item.removerDesconto();
			break;
		default:
			break;
		}
	}
	
	public void fazerPedido(Pedido pedido) {
		pedido.atualizarPedido();
		if (pedido.getStatus() == StatusPedido.PREPARANDO) {
			pedido.contabilizarPedido();
			pedido.calcularValorTotal();
		}
		this.pedidos.add(pedido);
	}
	
	public boolean cancelarPedido(Pedido pedido) {
		
		boolean sucesso = false;
		if (pedido.getStatus() == StatusPedido.NOVO || pedido.getStatus() == StatusPedido.PREPARANDO) {
			this.pedidos.remove(pedido);
			sucesso = true;
		}
		return sucesso;
	}
	
	public void atualizarPedido(Pedido pedido) {
		pedido.atualizarPedido();
		if (pedido.getStatus() == StatusPedido.CONCLUIDO) {
			this.pedidos.remove(pedido);
		}
	}
	
	public void imprimirCardapio() {
		System.out.printf("Restaurante %s\n", this.nome);
		System.out.printf("(CNPJ: %s)\n\n", this.cnpj);
		System.out.println("Cardapio de hoje:");
		for(Lanche item : this.cardapio) {
			item.imprimirInfo();
		}
		System.out.println("");
	}
	
	public void imprimirResumoPedidos() {
		
		if (this.pedidos.isEmpty()) {
			System.out.println("Nao ha pedidos no momento.");
		}
		
		System.out.printf("Existem %d pedidos:\n", this.pedidos.size());
		for(Pedido pedido : this.pedidos) {
			System.out.println("============================================");
			pedido.imprimirInfo();
		}
		System.out.println("============================================");
	}
}
