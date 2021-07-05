package com.unicamp.mc322.lab13.utils;

import com.unicamp.mc322.lab13.models.User;

public interface IOrder {

	public void incrementarTurno();
	
	public int getTurnos();
	
	public String getCodigo();
	
	public void printUser();
	
	public void printUserInfo();
	
	public User getUser();
	
	public void printInfoPedido();
	
	public boolean getTipoPedido();
}
