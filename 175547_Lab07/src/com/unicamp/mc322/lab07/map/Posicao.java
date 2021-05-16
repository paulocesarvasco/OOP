package com.unicamp.mc322.lab07.map;

public class Posicao {

	private char posicao[] = new char[2];
	TipoPosicao tipoPosicao = null;
	
	public Posicao() {
		this.posicao[0] = '-';
		this.posicao[1] = '-';
		tipoPosicao = TipoPosicao.VAZIA;
	}
	
	public void alterarPosicao(char a, char b, TipoPosicao tipo) {
		this.posicao[0] = a;
		this.posicao[1] = b;
		tipoPosicao = tipo;
	}
	
	public void alterarPosicao(char a, char b) {
		this.posicao[0] = a;
		this.posicao[1] = b;
	}
	
	public void resetarPosicao() {
		this.posicao[0] = '-';
		this.posicao[1] = '-';
		tipoPosicao = TipoPosicao.VAZIA;
	}
	
	public TipoPosicao getTipoPosicao() {
		return this.tipoPosicao;
	}
	
	public void mostrarPosicao() {
		System.out.printf("%c%c ", posicao[0], posicao[1]);
	}
}
