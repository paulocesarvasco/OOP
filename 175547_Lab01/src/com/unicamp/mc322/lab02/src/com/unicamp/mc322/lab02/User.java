package com.unicamp.mc322.lab02;

public class User {
	
	private String name;
	private String cpf;
	
	public User(String name, String cpf) {
		this.name = name;
		this.cpf = cpf;
	}
	public boolean changePlan() {
		this.subscriber = !this.subscriber;
		return false;
	}
}
