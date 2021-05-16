package com.unicamp.mc322.lab07.frogs;

import java.util.concurrent.ThreadLocalRandom;

import com.unicamp.mc322.lab07.map.Utils;

public class Venenosa extends Frog {

	public Venenosa(String nome, int x, int y) {
		super();
		super.nome = nome;
		super.posicaoAtual[0] = x;
		super.posicaoAtual[1] = y;
	}

	@Override
	public boolean moverCima() {
		boolean continuaJogo = true;
		String[] direcoes = { "w", "a", "s", "d" };
		int randomNum = ThreadLocalRandom.current().nextInt(0, 4);
		switch (direcoes[randomNum]) {
		case "w":
			continuaJogo = Cima();
			break;
		case "a":
			continuaJogo = Esquerda();
			break;
		case "s":
			continuaJogo = Baixo();
			break;
		case "d":
			continuaJogo = Direita();
			break;
		}
		return continuaJogo;
	}

	@Override
	public boolean moverBaixo() {
		boolean continuaJogo = true;
		String[] direcoes = { "w", "a", "s", "d" };
		int randomNum = ThreadLocalRandom.current().nextInt(0, 4);
		switch (direcoes[randomNum]) {
		case "w":
			continuaJogo = Cima();
			break;
		case "a":
			continuaJogo = Esquerda();
			break;
		case "s":
			continuaJogo = Baixo();
			break;
		case "d":
			continuaJogo = Direita();
			break;
		}
		return continuaJogo;
	}

	@Override
	public boolean moverEsquerda() {
		boolean continuaJogo = true;
		String[] direcoes = { "w", "a", "s", "d" };
		int randomNum = ThreadLocalRandom.current().nextInt(0, 4);
		switch (direcoes[randomNum]) {
		case "w":
			continuaJogo = Cima();
			break;
		case "a":
			continuaJogo = Esquerda();
			break;
		case "s":
			continuaJogo = Baixo();
			break;
		case "d":
			continuaJogo = Direita();
			break;
		}
		return continuaJogo;
	}

	@Override
	public boolean moverDireita() {
		boolean continuaJogo = true;
		String[] direcoes = { "w", "a", "s", "d" };
		int randomNum = ThreadLocalRandom.current().nextInt(0, 4);
		switch (direcoes[randomNum]) {
		case "w":
			continuaJogo = Cima();
			break;
		case "a":
			continuaJogo = Esquerda();
			break;
		case "s":
			continuaJogo = Baixo();
			break;
		case "d":
			continuaJogo = Direita();
			break;
		}
		return continuaJogo;
	}

	@Override
	public void aumentarSatisfacao(double satisfacao) {
		super.satisfacao += satisfacao * 1.2;
	}

	private boolean Cima() {
		boolean continuaJogo = true;
		int randomNum = ThreadLocalRandom.current().nextInt(1, 5);
		if (super.posicaoAtual[0] - randomNum >= 0) {
			atualizarPosicao(super.posicaoAtual[0] - randomNum, super.posicaoAtual[1]);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}

	private boolean Baixo() {
		boolean continuaJogo = true;
		int randomNum = ThreadLocalRandom.current().nextInt(1, 5);
		if (super.posicaoAtual[0] + randomNum < Utils.getMapSize()) {
			atualizarPosicao(super.posicaoAtual[0] + randomNum, super.posicaoAtual[1]);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}

	private boolean Esquerda() {
		boolean continuaJogo = true;
		int randomNum = ThreadLocalRandom.current().nextInt(1, 5);
		if (super.posicaoAtual[1] - randomNum >= 0) {
			atualizarPosicao(super.posicaoAtual[0], super.posicaoAtual[1] - randomNum);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}

	private boolean Direita() {
		boolean continuaJogo = true;
		int randomNum = ThreadLocalRandom.current().nextInt(1, 5);
		if (super.posicaoAtual[1] + randomNum < Utils.getMapSize()) {
			atualizarPosicao(super.posicaoAtual[0], super.posicaoAtual[1] + randomNum);
		} else {
			continuaJogo = false;
		}
		return continuaJogo;
	}
}
