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
	private int maxSongs = 10;
	
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
		if (this.subscriber) {
			maxSongs = 100;
		} else {
			maxSongs = 10;
		}
		return false;
	}
	
	public boolean addPlaylist(String name, String rhythm) {
		boolean error = false;
		
		if (!this.subscriber && this.playLists.size() >= 3) {
			System.out.printf("Max playlists added. Pls subscribe to add new playlists. ");
			error = true;
			return error;
		}
		if (this.subscriber && this.playLists.size() >= 10) {
			System.out.printf("Max playlists added. ");
			error = true;
			return error;
		}
		
		Playlist newPlayList = new Playlist(name, rhythm);
		this.playLists.add(newPlayList);
		return error;
	}
	
	public boolean addPlaylist(Playlist playlist) {

		boolean error = false;
		
		if (!this.subscriber && this.playLists.size() >= 3) {
			System.out.printf("Max playlists added. Pls subscribe to add new playlists. ");
			error = true;
			return error;
		}
		if (this.subscriber && this.playLists.size() >= 10) {
			System.out.printf("Max playlists added. ");
			error = true;
			return error;
		}
		
		this.playLists.add(playlist);
		return error;
	}
	
	private Playlist searchPlayList(String playListName) {
		
		boolean itemFounded = false;
		
		Playlist playListFounded = null;

		for (Playlist searchedPlaylist : this.playLists) {
			if (Objects.equals(searchedPlaylist.getName(), playListName)) {
				playListFounded = searchedPlaylist;
				itemFounded = true;
			}
		}
		if (!itemFounded) {
			System.out.printf("Playlist not found. ");
		}
		return playListFounded;
	}
	
	public boolean addSongToPlaylist(String playlistName, Song song) {
		
		boolean error = false;
		Playlist playlistFounded = null;

		playlistFounded = searchPlayList(playlistName);
		if (playlistFounded == null) {
			error = true;
			return error;
		}
		if (playlistFounded.playlistSize() >= maxSongs) {
			System.out.printf("Playlist full. ");
			if (!this.subscriber) {
				System.out.printf("Change your plan to add new musics. ");
			}
		}
		
		error = playlistFounded.addSong(song);
		return error;
	}
	
	public boolean removePlaylist(String playlistName) {
		
		boolean error = false;
		Playlist playlistRemoved = null;

		playlistRemoved = searchPlayList(playlistName);
		if (playlistRemoved == null) {
			error = true;
			return error;
		}
		this.playLists.remove(playlistRemoved);
		return error;
	}
	
	public boolean showPlaylists() {
		boolean error = false;
		int index = 1;
		System.out.printf("User: %s\n", this.name);
		System.out.printf("Number of playlists: %d\n", this.playLists.size());
		for (Playlist playlist : this.playLists) {
			playlist.showSongs(index);
			index++;
		}
		return error;
	}
	
	public boolean showInformation() {
		System.out.printf("Name: %s\n", this.name);
		System.out.printf("CPF: %s\n", this.cpf);
		return false;
	}

	public Song playSong(String playlistName) {
		
		Playlist playlistFounded = null;
		Song songPlayed = null;

		playlistFounded = searchPlayList(playlistName);
		if (playlistFounded != null) {
			songPlayed = playlistFounded.play();
		}
		
		return songPlayed;
	}
	
	public Song playSong(String playlistName, boolean shuffle) {
		
		Playlist playlistFounded = null;
		Song songPlayed = null;

		playlistFounded = searchPlayList(playlistName);
		if (playlistFounded != null) {
			songPlayed = playlistFounded.play(shuffle);
		}
		
		return songPlayed;
	}
}
