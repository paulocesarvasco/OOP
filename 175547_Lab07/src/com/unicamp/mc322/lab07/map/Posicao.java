package com.unicamp.mc322.lab07.map;

public class Posicao {

	private char posicao[] = new char[2];
	
	public Posicao() {
		this.posicao[0] = '-';
		this.posicao[1] = '-';
	}
	
	public void alterarPosicao(char a, char b) {
		this.posicao[0] = a;
		this.posicao[1] = b;
	}
	
	public void mostrarPosicao() {
		System.out.printf("%c%c ", posicao[0], posicao[1]);
	}
}
