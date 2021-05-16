package com.unicamp.mc322.lab07.obstacles;

public class Predador extends Obstacle {

	public Predador(int x, int y) {
		super();
		super.posicoes[0] = new int[1];
		super.posicoes[1] = new int[1];
			
		super.posicoes[0][0] = x;
		super.posicoes[1][0] = y;
	}
	
	public Predador(int x1, int y1, int x2, int y2) {
		super();
		if(Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1) {
			super.posicoes = new int[2][2];
			super.posicoes[0][0] = x1;
			super.posicoes[0][1] = y1;
			super.posicoes[1][0] = x2;
			super.posicoes[1][1] = y2;
		}
	}

	@Override
	public int[][] getPosicoes() {
		return super.posicoes;
	}

}
