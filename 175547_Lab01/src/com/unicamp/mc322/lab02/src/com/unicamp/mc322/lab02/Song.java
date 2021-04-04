package com.unicamp.mc322.lab02;

public class Song {
	
	private String name;
	private String rhythm;
	private String artist;
	private float duration;
	
	public Song(String name, String rhythm, String artist) {
		this.name = name;
		this.rhythm = rhythm;
		this.artist = artist;
	}
	
	public boolean renameSong(String newName) {
		boolean error = false;
		
		if (newName.isBlank()) {
			System.out.printf("Invalid string. ");
			error = true;
			return error;
		}
		this.name = newName;
		return error;
	}
	
	public boolean changeRhythm(String rhythm) {
		boolean error = false;
		
		if (rhythm.isBlank()) {
			System.out.printf("Invalid string. ");
			error = true;
			return error;
		}
		this.rhythm = rhythm;
		return error;
	}
	
	public boolean renameArtist(String newArtist) {
		boolean error = false;
		
		if (newArtist.isBlank()) {
			System.out.printf("Invalid string. ");
			error = true;
			return error;
		}
		this.artist = newArtist;
		return error;
	}
	
	public boolean setDuration(float time) {
		boolean erro = false;
		
		if (time <= 0) {
			System.out.printf("Invalid value");
			erro = true;
		}
		this.duration = time;
		return erro;
	}
}
