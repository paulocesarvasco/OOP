package com.unicamp.mc322.lab07;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import com.unicamp.mc322.lab07.foods.Grilo;
import com.unicamp.mc322.lab07.foods.Vagalume;
import com.unicamp.mc322.lab07.frogs.Frog;
import com.unicamp.mc322.lab07.frogs.Tomato;
import com.unicamp.mc322.lab07.frogs.Venenosa;
import com.unicamp.mc322.lab07.frogs.Verde;
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
		Vagalume vagalume = new Vagalume(1, 3);
		Grilo grilo = new Grilo(4, 7);
		Verde jogador_1 = new Verde("Jogador 1", 8, 7);
		Tomato jogador_2 = new Tomato("Jogador 2", 8, 7);
		Venenosa jogador_3 = new Venenosa("Jogador 3", 8, 7);

		mapa.inserirObstaculo(pedra_1);
		mapa.inserirObstaculo(pedra_2);
		mapa.inserirObstaculo(pedra_3);
		mapa.inserirObstaculo(pedra_4);
		mapa.inserirObstaculo(pedra_5);
		mapa.inserirObstaculo(predador);
		mapa.inserirObstaculo(armadilha);
		mapa.inserirComida(vagalume);
		mapa.inserirComida(grilo);
		mapa.inserirJogador(jogador_1);
		runGame(mapa, jogador_1);
		
		mapa.inserirObstaculo(pedra_1);
		mapa.inserirObstaculo(pedra_2);
		mapa.inserirObstaculo(pedra_3);
		mapa.inserirObstaculo(pedra_4);
		mapa.inserirObstaculo(pedra_5);
		mapa.inserirObstaculo(predador);
		mapa.inserirObstaculo(armadilha);
		mapa.inserirComida(vagalume);
		mapa.inserirComida(grilo);
		mapa.inserirJogador(jogador_2);
		runGame(mapa, jogador_2);
		
		mapa.inserirObstaculo(pedra_1);
		mapa.inserirObstaculo(pedra_2);
		mapa.inserirObstaculo(pedra_3);
		mapa.inserirObstaculo(pedra_4);
		mapa.inserirObstaculo(pedra_5);
		mapa.inserirObstaculo(predador);
		mapa.inserirObstaculo(armadilha);
		mapa.inserirComida(vagalume);
		mapa.inserirComida(grilo);
		mapa.inserirJogador(jogador_3);
		runGame(mapa, jogador_3);

	}

	private static void runGame(Map mapa, Frog frog) {
		Scanner keyboard = new Scanner(System.in);
		boolean running = true;
		
		mapa.mostrarMapa();
		while (running) {
			System.out.print("Enter the command: ");
			String command = keyboard.nextLine();
			if (command.compareTo("quit") == 0) {
				running = false;
			} else if (command.compareTo("w") == 0) {
				if (frog.moverCima()) {
					running = mapa.moverJogador(frog);
					mapa.mostrarMapa();
				} else {
					mapa.retirarJogador(frog);
					mapa.mostrarMapa();
					running = false;
				}
			} else if (command.compareTo("a") == 0) {
				if (frog.moverEsquerda()) {
					running = mapa.moverJogador(frog);
					mapa.mostrarMapa();
				} else {
					mapa.retirarJogador(frog);
					mapa.mostrarMapa();
					running = false;
				}
			} else if (command.compareTo("s") == 0) {
				if (frog.moverBaixo()) {
					running = mapa.moverJogador(frog);
					mapa.mostrarMapa();
				} else {
					mapa.retirarJogador(frog);
					mapa.mostrarMapa();
					running = false;
				}
			} else if (command.compareTo("d") == 0) {
				if (frog.moverDireita()) {
					running = mapa.moverJogador(frog);
					mapa.mostrarMapa();
				} else {
					mapa.retirarJogador(frog);
					mapa.mostrarMapa();
					running = false;
				}
			}
		}
		System.out.printf("Pontos de satifacao do %s: %.1f\n", frog.getNome(), frog.getSatisfacao());
	}

}
