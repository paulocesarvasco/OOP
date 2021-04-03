package com.unicamp.mc322.lab01;

 import java.util.Scanner;

 	public class InputOutput {
 		
		static Scanner input = new Scanner(System.in);

 		public static void main(String[] args) {
 			
 			boolean isPrime, repeat = true;
 			
 			while (repeat) {
 				System.out.println("Digite 1 para somar");
 				System.out.println("Digite 2 para subtrair");
 				System.out.println("Digite 3 para multiplicar");
 				System.out.println("Digite 4 para dividir");
 				System.out.println("Digite 5 para calcular fatorial");
 				System.out.println("Digite 6 para verificar se um numero primo");
 				System.out.println("Digite qualquer outro valor para sair do programa.");
 			
 				int num = readNumber();
 				
 				switch (num) {
 				case 1:
 					System.out.println(Operations.add());
 					repeat = repeatOpration();
 					break;
 				case 2:
 					System.out.println(Operations.sub());
 					repeat = repeatOpration();
 					break;
 				case 3:
 					System.out.println(Operations.times());
 					repeat = repeatOpration();
 					break;
 				case 4:
 					System.out.println(Operations.divison());
 					repeat = repeatOpration();
 					break;
 				case 5:
 					System.out.println(Operations.fatorial());
 					repeat = repeatOpration();
 					break;
 				case 6:
 					isPrime = Operations.isPrime();
 					if (isPrime) {
 						System.out.println("Eh primo.");
 					} else {
 						System.out.println("Nao eh primo.");
 					}
 					repeat = repeatOpration();
 					break;
 				default:
 					repeat = false;
 					break;
 				}
 			}
 		}
 		
 		public static int readNumber() {
 			
 			int num = input.nextInt();
 			return num;
 		}
 		
 		public static boolean repeatOpration() {
 			
 			int option;
 			
 			while (true) {
 				System.out.println("Digite 1 para realizar outra operacao");
 				System.out.println("Digite 2 para finalizar");
 			
 				option = input.nextInt();
 			
 				if (option == 1) {
 					return true;
 				} else if (option == 2) {
 					return false;
 				}
 			}
 	}
 }