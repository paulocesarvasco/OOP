package com.unicamp.mc322.lab04;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	private User user;
	private StatusPedido status;
	private double valorTotal = 0;
	private List<Lanche> itens = new ArrayList<Lanche>();
	
	// Construtor
	public Pedido(User novoUsuario) {
		this.user = novoUsuario;
		this.status = StatusPedido.NOVO;
	}
	
	public StatusPedido getStatus() {
		return this.status;
	}
	
	// Adionar item ao pedido
	public void addItem(Lanche item) {
		itens.add(item);
	}
	
	public void atualizarPedido() {
		switch (this.status) {
		case NOVO:
			this.status = StatusPedido.PREPARANDO;
			break;
		case PREPARANDO:
			this.status = StatusPedido.ENTREGA;
			break;
		case ENTREGA:
			this.status = StatusPedido.CONCLUIDO;
			break;
		default:
			break;
		}
	}
	
	public void calcularValorTotal() {
		for (Lanche item : this.itens) {
			this.valorTotal += item.getPreco();
		}
		if (user.getPedidos() == 1) {
			this.valorTotal *= 0.8;
		} else if (user.getPedidos() % 10 == 0) {
			this.valorTotal -= 60;
			if (this.valorTotal < 0) {
				this.valorTotal = 0;
			}
		}
		if (this.valorTotal >= 100) {
			this.valorTotal *= 0.9;
		}
	}
	
	public void contabilizarPedido() {
		this.user.incrementarPedido();
	}
	
	public void imprimirInfo() {
		System.out.printf("Usuario: %s (%s)\n", this.user.getNome(), this.user.getCpf());
		for (Lanche item : this.itens) {
			System.out.printf("- %s\n", item.getIdentificador());
		}
		System.out.printf("Valor total: R$ %.2f\n", this.valorTotal);
	}
}
