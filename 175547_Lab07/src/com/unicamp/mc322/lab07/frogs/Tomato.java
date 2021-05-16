package com.unicamp.mc322.lab07.frogs;

import java.util.concurrent.ThreadLocalRandom;

import com.unicamp.mc322.lab07.map.Utils;

public class Tomato extends Frog {

	public Tomato(String nome, int x, int y) {
		super();
		super.nome = nome;
		super.posicaoAtual[0] = x;
		super.posicaoAtual[1] = y;
	}

	@Override
	public boolean moverCima() {
		boolean continuaJogo = true;
		int randomNum = ThreadLocalRandom.current().nextInt(2, 4);
		if (super.posicaoAtual[0] - randomNum >= 0) {
			atualizarPosicao(super.posicaoAtual[0] - randomNum, super.posicaoAtual[1]);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}

	@Override
	public boolean moverBaixo() {
		boolean continuaJogo = true;
		int[] numPosicoes = { 1, 2, 4 };
		int randomNum = ThreadLocalRandom.current().nextInt(0, 3);

		if (super.posicaoAtual[0] + numPosicoes[randomNum] < Utils.getMapSize()) {
			atualizarPosicao(super.posicaoAtual[0] + numPosicoes[randomNum], super.posicaoAtual[1]);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}

	@Override
	public boolean moverEsquerda() {
		boolean continuaJogo = true;
		int randomNum = ThreadLocalRandom.current().nextInt(1, 4);
		if (super.posicaoAtual[1] - randomNum >= 0) {
			atualizarPosicao(super.posicaoAtual[0], super.posicaoAtual[1] - randomNum);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}

	@Override
	public boolean moverDireita() {
		boolean continuaJogo = true;
		int randomNum = ThreadLocalRandom.current().nextInt(1, 4);
		if (super.posicaoAtual[1] + randomNum < Utils.getMapSize()) {
			atualizarPosicao(super.posicaoAtual[0], super.posicaoAtual[1] + randomNum);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}

	@Override
	public void aumentarSatisfacao(double satisfacao) {
		super.satisfacao += satisfacao * 1.1;

	}
}