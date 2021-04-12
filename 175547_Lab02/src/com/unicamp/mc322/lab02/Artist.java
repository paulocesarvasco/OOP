package com.unicamp.mc322.lab02;

public class Artist {
	private String name;
	private int occurrences = 0;
	
	public String getName() {
		return this.name;
	}
	
	public int getOccurrences() {
		return this.occurrences;
	}
	
	public void setName (String artistName) {
		this.name = artistName;
	}
	
	public void setOccurrences() {
		this.occurrences++;
	}
	
	public void zeroOccurrences() {
		this.occurrences = 0;
	}
}
