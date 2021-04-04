package com.unicamp.mc322.lab02;

import java.util.ArrayList;
import java.util.List;

public class Playlist {
	private String name;
	private String rhythm;
	
    private List<Song> songs = new ArrayList<Song>();

	
	public Playlist(String name, String rhythm) {
		this.name = name;
		this.rhythm = rhythm;
	}
	
	public boolean addSong(Song song) {
		
		boolean error = false;
		
		error = this.songs.add(song);
		return !error;
	}
}
