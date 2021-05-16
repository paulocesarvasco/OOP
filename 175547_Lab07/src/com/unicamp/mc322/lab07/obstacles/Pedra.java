package com.unicamp.mc322.lab07.obstacles;

public class Pedra extends Obstacle {

	public Pedra(int x, int y) {
		super();
			super.posicoes = new int[1][2];
			
			super.posicoes[0][0] = x;
			super.posicoes[0][1] = y;

	}
	@Override
	public int[][] getPosicoes() {
		return super.posicoes;
	}

}
