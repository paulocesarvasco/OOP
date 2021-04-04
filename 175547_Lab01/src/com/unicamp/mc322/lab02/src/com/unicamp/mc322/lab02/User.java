package com.unicamp.mc322.lab02;

public class User {
	
	private String name;
	private String cpf;
	
	public User(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	
	public boolean setGender(String gender) {
		
		boolean error;
		
		if (Objects.equals(gender, "male") || Objects.equals(gender, "female")) {
			this.gender = gender;
			error = false;
		} else {
			System.out.printf("Invalid gender. ");
			error = true;
		}
		return error;
	}
	public boolean changePlan() {
		this.subscriber = !this.subscriber;
		return false;
	}
}
