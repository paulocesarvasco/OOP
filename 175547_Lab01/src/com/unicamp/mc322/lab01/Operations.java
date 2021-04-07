package com.unicamp.mc322.lab01;

public class Operations {
	
	public static int add() {
		
		System.out.println("Insira dois valores:");
		
		int num_1, num_2;
		num_1 = InputOutput.readNumber();
		num_2 = InputOutput.readNumber();
		
		return num_1 + num_2;
		
	}
	
	public static int sub() {
		
		System.out.println("Insira dois valores:");
		
		int num_1, num_2;
		num_1 = InputOutput.readNumber();
		num_2 = InputOutput.readNumber();
		
		return num_1 - num_2;
		
	}

	public static int times() {
		
		System.out.println("Insira dois valores:");
	
		int num_1, num_2;
		num_1 = InputOutput.readNumber();
		num_2 = InputOutput.readNumber();
	
		return num_1 * num_2;
	
	}
	
	public static int divison() {
		
		System.out.println("Insira dois valores:");
		
		int num_1, num_2;
		num_1 = InputOutput.readNumber();
		num_2 = InputOutput.readNumber();
		
		return num_1 / num_2;
		
	}
	
	public static int fatorial() {
		
		System.out.println("Insira um valor:");
		
		int i, num, result = 1;
		num = InputOutput.readNumber();
		
		for (i = 1; i <= num; i++) {
			result *= i;
		}
		
		return result;
		
	}
	
	public static boolean isPrime() {
		
		System.out.println("Insira um valor:");
		
		int i, num;
		
		num = InputOutput.readNumber();
		
		if (num <= 1) {
			return false;
		}
		
		for (i = 2; i <= num/2; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}

}