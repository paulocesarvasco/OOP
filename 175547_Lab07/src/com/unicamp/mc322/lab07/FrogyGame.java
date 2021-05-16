package com.unicamp.mc322.lab07;

import com.unicamp.mc322.lab07.foods.Grilo;
import com.unicamp.mc322.lab07.foods.Vagalume;
import com.unicamp.mc322.lab07.map.Map;
import com.unicamp.mc322.lab07.obstacles.Armadilha;
import com.unicamp.mc322.lab07.obstacles.Pedra;
import com.unicamp.mc322.lab07.obstacles.Predador;

public class FrogyGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map mapa = new Map();
		
		Pedra pedra_1 = new Pedra(2, 7);
		Pedra pedra_2 = new Pedra(3, 2);
		Pedra pedra_3 = new Pedra(7, 1);
		Pedra pedra_4 = new Pedra(8, 4);
		Pedra pedra_5 = new Pedra(8, 8);
		Predador predador = new Predador(4, 4, 5, 5);
		Armadilha armadilha = new Armadilha(0, 0, 0, 1);
		
		mapa.inserirObstaculo(pedra_1);
		mapa.inserirObstaculo(pedra_2);
		mapa.inserirObstaculo(pedra_3);
		mapa.inserirObstaculo(pedra_4);
		mapa.inserirObstaculo(pedra_5);
		mapa.inserirObstaculo(predador);
		mapa.inserirObstaculo(armadilha);
		
		Vagalume vagalume = new Vagalume(1, 3);
		Grilo grilo = new Grilo(4, 7);
		
		mapa.inserirComida(vagalume);
		mapa.inserirComida(grilo);
		
		mapa.mostrarMapa();
	}

}
