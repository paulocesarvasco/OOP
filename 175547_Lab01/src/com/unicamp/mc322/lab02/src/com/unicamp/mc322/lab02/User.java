package com.unicamp.mc322.lab02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
	
	private String name;
	private String cpf;
	private String gender;
	private int[] date = {0, 0, 0};
	private boolean subscriber = false;
	
    private List<Playlist> playLists = new ArrayList<Playlist>();
	
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
	
	public boolean setDate(int day, int month, int year) {
		
		boolean error = false;
		
		if (day < 0 || day > 31) {
			System.out.printf("Invalid date. ");
			error = true;
		}
		if (month < 0 || month > 12) {
			System.out.printf("Invalid month. ");
			error = true;
		}
		if (year < 0) {
			System.out.printf("Invalid year. ");
			error = true;
		}
		if (error) {
			return error;
		}
		
		this.date[0] = day;
		this.date[1] = month;
		this.date[2] = year;
		
		return error;
	}
	public boolean changePlan() {
		this.subscriber = !this.subscriber;
		return false;
	}
}
