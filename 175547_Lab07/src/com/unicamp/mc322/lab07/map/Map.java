package com.unicamp.mc322.lab07.map;

import com.unicamp.mc322.lab07.foods.Grilo;
import com.unicamp.mc322.lab07.foods.Vagalume;
import com.unicamp.mc322.lab07.obstacles.Armadilha;
import com.unicamp.mc322.lab07.obstacles.Pedra;
import com.unicamp.mc322.lab07.obstacles.Predador;

public class Map {

	private Posicao[][] mapa = new Posicao[10][10]; 
	
	public Map() {
		for (int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				mapa[x][y] = new Posicao();
			}
		}
	}
	
	public void inserirObstaculo(Pedra pedra) {
		int[][] coordenadas = pedra.getPosicoes();
		mapa[coordenadas[0][0]][coordenadas[0][1]].alterarPosicao('<', '>');
	}
	
	public void inserirObstaculo(Predador predador) {
		int[][] coordenadas = predador.getPosicoes();
		for(int i = 0; i < coordenadas.length; i++) {
			mapa[coordenadas[i][0]][coordenadas[i][1]].alterarPosicao('$', '$');
		}
	}
	
	public void inserirObstaculo(Armadilha armadilha) {
		int[][] coordenadas = armadilha.getPosicoes();
		for(int i = 0; i < coordenadas.length; i++) {
			mapa[coordenadas[i][0]][coordenadas[i][1]].alterarPosicao('{', '}');
		}
	}
	
	public void inserirComida(Vagalume vagalume) {
		int[] coordenadas = vagalume.getPosicao();
		mapa[coordenadas[0]][coordenadas[1]].alterarPosicao('v', 'a');
	}
	
	public void inserirComida(Grilo grilo) {
		int[] coordenadas = grilo.getPosicao();
		mapa[coordenadas[0]][coordenadas[1]].alterarPosicao('g', 'r');
	}
	
	public void mostrarMapa() {
		for (int x = 0; x < 10; x++) {
			for(int y = 0; y < 10; y++) {
				this.mapa[x][y].mostrarPosicao();
			}
			System.out.println("");
		}
	}
}
