package com.unicamp.mc322.lab07.frogs;

public abstract class Frog {

	protected String nome;
	protected int satisfacao = 0;
	protected int[] posicaoAnterior = new int[2];
	protected int[] posicaoAtual = new int[2];
	
	protected abstract void atualizarPosicao(int x, int y);

	public abstract boolean moverCima();
	
	public abstract boolean moverBaixo();
	
	public abstract boolean moverEsquerda();
	
	public abstract boolean moverDireita();
}
