package com.unicamp.mc322.lab13.models;

import com.unicamp.mc322.lab13.utils.IOrder;
import com.unicamp.mc322.lab13.utils.RandomString;

public class Presencial implements IOrder {

	private User user;
	private String codigo;
	private int turnos;
	private boolean isPresencial;
	
	public Presencial(User user) {
		this.user = user;
		codigo = "PR" + RandomString.generate();
		turnos = 0;
		isPresencial = true;
	}

	@Override
	public void incrementarTurno() {
		turnos++;
		
	}

	@Override
	public int getTurnos() {
		return turnos;
	}

	@Override
	public String getCodigo() {
		return codigo;
	}

	@Override
	public void printUser() {
		System.out.println("Usuario: " + user.getNome());
		
	}

	@Override
	public void printUserInfo() {
		user.printInfos();
	}

	@Override
	public User getUser() {
		return user;
	}

	@Override
	public void printInfoPedido() {
		System.out.printf("Codigo pedido: %s, turnos de espera: %d - ", codigo, turnos);
		user.printInfos();
	}

	@Override
	public boolean getTipoPedido() {
		return isPresencial;
	}
}
