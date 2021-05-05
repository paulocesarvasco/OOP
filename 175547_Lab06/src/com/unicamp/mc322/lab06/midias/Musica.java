package com.unicamp.mc322.lab06.midias;

public class Musica extends Midia {

	public Musica (String nome, double duracao, String autor) {
		super(nome, duracao, autor);
		
	}
	
	@Override
	public double calcularArmazenamento(double duracao) {
		
		double minutos;	
		minutos = (int)duracao / 60;
		minutos += duracao % 60;
		
		return (minutos * 5);
	}
}
