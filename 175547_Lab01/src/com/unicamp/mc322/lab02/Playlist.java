package com.unicamp.mc322.lab02;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class Playlist {
	private String name;
	private String rhythm;
	private int index = 0;
	
    private List<Song> songs = new ArrayList<Song>();

	
	public Playlist(String name, String rhythm) {
		this.name = name;
		this.rhythm = rhythm;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int playlistSize() {
		return this.songs.size();
	}
	
	public boolean addSong(Song song) {
		
		boolean error = false;
		
		error = this.songs.add(song);
		return !error;
	}
	
	public boolean showSongs(int index) {
		
		boolean error = false;
		System.out.printf("Playlist %d: %s\n", index, this.name);
		System.out.printf("		Number of Songs: %d\n", this.songs.size());
		System.out.println("		Songs:");
		for (Song song : this.songs) {
			song.showInfo();
		}
		return error;
	}
	
	public Song play() {
		Song songPlayed = null;
		
		if (index <= this.songs.size()) {
			songPlayed = this.songs.get(index);
			index++;
		} else {
			System.out.printf("End playlist. ");
		}
		return songPlayed;
	}
	
	public Song play(boolean shuffle) {
		int randomIndex = 0;
		Song songPlayed = null;
		Random random = new Random();
		
		if (shuffle) {
			do {
				randomIndex = random.nextInt(this.songs.size());
			} while (index == randomIndex);
			index = randomIndex;
		}
		songPlayed = this.songs.get(index);
		index++;
		
		return songPlayed;
	}
}
