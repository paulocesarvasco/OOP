package com.unicamp.mc322.lab07.frogs;

public class Verde extends Frog {
	
	public Verde(String nome, int x, int y) {
		super();
		super.nome = nome;
		super.posicaoAtual[0] = x;
		super.posicaoAtual[1] = y;
	}

	@Override
	protected void atualizarPosicao(int x, int y) {
		super.posicaoAnterior = super.posicaoAtual;
		super.posicaoAtual[0] = x;
		super.posicaoAtual[1] = y;
	}

	@Override
	public boolean moverCima(int posicoes) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moverBaixo(int posicoes) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moverEsquerda(int posicoes) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moverDireita(int posicoes) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moverCima() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moverBaixo() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moverEsquerda() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean moverDireita() {
		// TODO Auto-generated method stub
		return false;
	}

}
