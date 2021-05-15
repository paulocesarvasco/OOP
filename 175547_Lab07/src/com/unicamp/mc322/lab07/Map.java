package com.unicamp.mc322.lab07;

public class Map {

	private Posicao[][] map = new Posicao[10][10]; 
	
	public Map() {
		for (int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				map[x][y] = new Posicao();
			}
		}
	}
	
	public void criarPedra(int x, int y) {
		this.map[x][y].alterarPosicao('<', '>');
	}
	
	public void criarPredador(int x, int y) {
		this.map[x][y].alterarPosicao('$', '$');
	}
	
	public void criarPredador(int x1, int y1, int x2, int y2) {
		if(Math.abs(x1 - x2) <= 1 && Math.abs(y1 - y2) <= 1) {
			this.map[x1][y1].alterarPosicao('$', '$');
			this.map[x2][y2].alterarPosicao('$', '$');
		}
	}
	
	public void criarArmadilha(int x, int y) {
		this.map[x][y].alterarPosicao('{', '}');
	}
	
	public void criarArmadilha(int x1, int y1, int x2, int y2) {
		if(calcularDistancia(x1, y1, x2, y2) <= 2) {
			this.map[x1][y1].alterarPosicao('{', '}');
			this.map[x2][y2].alterarPosicao('{', '}');
		}
	}
	
	public void criarArmadilha(int x1, int y1, int x2, int y2, int x3, int y3) {
		if((calcularDistancia(x1, y1, x2, y2) <= 2) && (calcularDistancia(x1, y1, x3, y3) <= 2) && (calcularDistancia(x2, y2, x3, y3) <= 2)){
			this.map[x1][y1].alterarPosicao('{', '}');
			this.map[x2][y2].alterarPosicao('{', '}');
			this.map[x3][y3].alterarPosicao('{', '}');
		}
	}
	
	private int calcularDistancia(int x1, int y1, int x2, int y2) {
		return Math.abs(x1 - x2) + Math.abs(y1 - y2);
	}
	
	public void mostrarMapa() {
		for (int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				this.map[x][y].mostrarPosicao();
			}
			System.out.println("");
		}
	}
}
