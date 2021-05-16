package com.unicamp.mc322.lab07.frogs;

public abstract class Frog {

	protected String nome;
	protected double satisfacao = 0;
	protected int[] posicaoAnterior = new int[2];
	protected int[] posicaoAtual = new int[2];

	protected void atualizarPosicao(int x, int y) {
		this.posicaoAnterior[0] = this.posicaoAtual[0];
		this.posicaoAnterior[1] = this.posicaoAtual[1];
		this.posicaoAtual[0] = x;
		this.posicaoAtual[1] = y;
	}

	public abstract boolean moverCima();

	public abstract boolean moverBaixo();

	public abstract boolean moverEsquerda();

	public abstract boolean moverDireita();

	public abstract void aumentarSatisfacao(double satisfacao);

	public int[] getPosicaoAtual() {
		return this.posicaoAtual;
	}

	public int[] getPosicaoAnterior() {
		return this.posicaoAnterior;
	}

	public double getSatisfacao() {
		return this.satisfacao;
	}
	
	public String getNome() {
		return this.nome;
	}
}
