package com.unicamp.mc322.lab13.utils;

public interface ICrazyDS {

	public void add(IOrder pedido);
	
	public void remove(IOrder pedido);
	
	public IOrder peek();
	
	public IOrder get(int index);
	
	public void printPedidos();
	
	public void sortPedidos();
	
	public void incrementarTurnos();
}
