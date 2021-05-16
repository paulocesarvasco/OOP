package com.unicamp.mc322.lab07.foods;

public abstract class Food {

	protected String nome;
	protected int satisfacao;
	protected int[] posicao = new int[2];
	
	public int[] getPosicao() {
		return this.posicao;
	}
}
