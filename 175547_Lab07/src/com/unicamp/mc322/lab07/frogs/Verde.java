package com.unicamp.mc322.lab07.frogs;

import com.unicamp.mc322.lab07.map.Utils;

public class Verde extends Frog {

	public Verde(String nome, int x, int y) {
		super();
		super.nome = nome;
		super.posicaoAtual[0] = x;
		super.posicaoAtual[1] = y;
	}

	@Override
	public boolean moverCima() {
		boolean continuaJogo = true;
		if (super.posicaoAtual[0] - 1 >= 0) {
			atualizarPosicao(super.posicaoAtual[0] - 1, super.posicaoAtual[1]);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}

	@Override
	public boolean moverBaixo() {
		boolean continuaJogo = true;
		if (super.posicaoAtual[0] + 1 < Utils.getMapSize()) {
			atualizarPosicao(super.posicaoAtual[0] + 1, super.posicaoAtual[1]);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}

	@Override
	public boolean moverEsquerda() {
		boolean continuaJogo = true;
		if (super.posicaoAtual[1] - 1 >= 0) {
			atualizarPosicao(super.posicaoAtual[0], super.posicaoAtual[1] - 1);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}

	@Override
	public boolean moverDireita() {
		boolean continuaJogo = true;
		if (super.posicaoAtual[1] + 1 < Utils.getMapSize()) {
			atualizarPosicao(super.posicaoAtual[0], super.posicaoAtual[1] + 1);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}

	@Override
	public void aumentarSatisfacao(double satisfacao) {
		super.satisfacao += satisfacao;
	}
}
