package com.unicamp.mc322.lab07.obstacles;

public class Armadilha extends Obstacle {

	public Armadilha(int x, int y) {
		super();
		super.posicoes = new int [1][2];
			
		super.posicoes[0][0] = x;
		super.posicoes[0][1] = y;
	}
	
	public Armadilha(int x1, int y1, int x2, int y2) {
		super();
		if (calcularDistancia(x1, y1, x2, y2) <= 2) {
			
			super.posicoes = new int[2][2];
			
			super.posicoes[0][0] = x1;
			super.posicoes[0][1] = y1;
			super.posicoes[1][0] = x2;
			super.posicoes[1][1] = y2;
		}
	}
	
	public Armadilha(int x1, int y1, int x2, int y2, int x3, int y3) {
		super();
		if((calcularDistancia(x1, y1, x2, y2) <= 2) && (calcularDistancia(x1, y1, x3, y3) <= 2) && (calcularDistancia(x2, y2, x3, y3) <= 2)) {
			super.posicoes = new int[3][2];
				
			super.posicoes[0][0] = x1;
			super.posicoes[0][1] = y1;
			super.posicoes[1][0] = x2;
			super.posicoes[1][1] = y2;
			super.posicoes[2][0] = x3;
			super.posicoes[2][1] = y3;
		}
	}

	@Override
	public int[][] getPosicoes() {
		return super.posicoes;
	}
	
	private int calcularDistancia(int x1, int y1, int x2, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}

}
