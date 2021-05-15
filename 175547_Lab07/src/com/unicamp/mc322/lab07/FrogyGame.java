package com.unicamp.mc322.lab07;

public class FrogyGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map mapa = new Map();
		
		mapa.criarPedra(2, 7);
		mapa.criarPedra(3, 2);
		mapa.criarPedra(7, 1);
		mapa.criarPedra(7, 1);
		mapa.criarPedra(8, 4);
		mapa.criarPedra(8, 8);
		mapa.criarPredador(4, 4, 5, 5);
		mapa.criarArmadilha(0, 0, 0, 1);
		mapa.mostrarMapa();
	}

}
