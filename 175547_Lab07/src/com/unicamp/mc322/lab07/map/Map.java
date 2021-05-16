package com.unicamp.mc322.lab07.map;

import com.unicamp.mc322.lab07.foods.Grilo;
import com.unicamp.mc322.lab07.foods.Vagalume;
import com.unicamp.mc322.lab07.frogs.Frog;
import com.unicamp.mc322.lab07.obstacles.Armadilha;
import com.unicamp.mc322.lab07.obstacles.Pedra;
import com.unicamp.mc322.lab07.obstacles.Predador;

public class Map {

	private Posicao[][] mapa = new Posicao[Utils.getMapSize()][Utils.getMapSize()];

	public Map() {
		for (int x = 0; x < Utils.getMapSize(); x++) {
			for (int y = 0; y < Utils.getMapSize(); y++) {
				mapa[x][y] = new Posicao();
			}
		}
	}

	public void inserirObstaculo(Pedra pedra) {
		int[][] coordenadas = pedra.getPosicoes();
		mapa[coordenadas[0][0]][coordenadas[0][1]].alterarPosicao('<', '>', TipoPosicao.PEDRA);
	}

	public void inserirObstaculo(Predador predador) {
		int[][] coordenadas = predador.getPosicoes();
		for (int i = 0; i < coordenadas.length; i++) {
			mapa[coordenadas[i][0]][coordenadas[i][1]].alterarPosicao('$', '$', TipoPosicao.PREDADOR);
		}
	}

	public void inserirObstaculo(Armadilha armadilha) {
		int[][] coordenadas = armadilha.getPosicoes();
		for (int i = 0; i < coordenadas.length; i++) {
			mapa[coordenadas[i][0]][coordenadas[i][1]].alterarPosicao('{', '}', TipoPosicao.ARMADILHA);
		}
	}

	public void inserirComida(Vagalume vagalume) {
		int[] coordenadas = vagalume.getPosicao();
		mapa[coordenadas[0]][coordenadas[1]].alterarPosicao('v', 'a', TipoPosicao.VAGALUME);
	}

	public void inserirComida(Grilo grilo) {
		int[] coordenadas = grilo.getPosicao();
		mapa[coordenadas[0]][coordenadas[1]].alterarPosicao('g', 'r', TipoPosicao.GRILO);
	}

	public void inserirJogador(Frog frog) {
		int[] coordenadaAtual = frog.getPosicaoAtual();
		mapa[coordenadaAtual[0]][coordenadaAtual[1]].alterarPosicao(frog.getNome().charAt(0), frog.getNome().charAt(frog.getNome().length() - 1));
	}

	public boolean moverJogador(Frog frog) {

		boolean continuaJogo = true;
		int[] coordenadaAtual = frog.getPosicaoAtual();
		int[] coordenadaAnterior = frog.getPosicaoAnterior();

		TipoPosicao tipo = mapa[coordenadaAtual[0]][coordenadaAtual[1]].getTipoPosicao();

		if (tipo == TipoPosicao.ARMADILHA || tipo == TipoPosicao.PEDRA || tipo == TipoPosicao.PREDADOR) {
			continuaJogo = false;
		} else if (tipo == TipoPosicao.GRILO) {
			frog.aumentarSatisfacao(Utils.getSatisfacaoGrilo());
		} else if (tipo == TipoPosicao.VAGALUME) {
			frog.aumentarSatisfacao(Utils.getSatisfacaoVagalume());
		}

		mapa[coordenadaAtual[0]][coordenadaAtual[1]].alterarPosicao('J', '1');
		mapa[coordenadaAnterior[0]][coordenadaAnterior[1]].resetarPosicao();

		return continuaJogo;
	}
	
	public void retirarJogador(Frog frog) {
		int[] coordenadaAtual = frog.getPosicaoAtual();
		mapa[coordenadaAtual[0]][coordenadaAtual[1]].resetarPosicao();
	}

	public void mostrarMapa() {
		for (int x = 0; x < Utils.getMapSize(); x++) {
			for (int y = 0; y < Utils.getMapSize(); y++) {
				this.mapa[x][y].mostrarPosicao();
			}
			System.out.println("");
		}
	}
}
