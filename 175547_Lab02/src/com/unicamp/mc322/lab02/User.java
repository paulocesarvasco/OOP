package com.unicamp.mc322.lab02;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class User {
	
	private String name;
	private String cpf;
	private String gender;
	private Date date;
	private boolean subscriber = false;
	private int maxSongs = 10;
	
    private List<Playlist> playLists = new ArrayList<Playlist>();
	
	public User(String name, String cpf, String gender, String date) throws ParseException {
		this.name = name;
		this.cpf = cpf;
		setGender(gender);
		this.date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
	}
	
	private boolean setGender(String gender) {
		
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
			System.out.printf("Max playlists added. Pls subscribe to add new playlists.\n");
			error = true;
			return error;
		}
		if (this.subscriber && this.playLists.size() >= 10) {
			System.out.printf("Max playlists added.\n");
			error = true;
			return error;
		}
		
		Playlist newPlayList = new Playlist(name, rhythm);
		this.playLists.add(newPlayList);
		return error;
	}
	
	public boolean addPlaylist(Playlist playlist) {

		boolean error = false;
		
		if (this.subscriber) {
			if (this.playLists.size() >= 10) {
				System.out.printf("Max playlists added.\n");
				error = true;
				return error;
			} else if (playlist.size() > 100) {
				System.out.printf("Playlist exceeds 100 songs.\n");
				error = true;
				return error;
			}
		} else {
			if (this.playLists.size() >= 3) {
			System.out.printf("Max playlists added. Pls subscribe to add new playlists.\n");
			error = true;
			return error;
			} else if (playlist.size() > 10) {
				System.out.printf("Playlist exceeds 10 songs. Pls subscribe to add new playlists up to 100 songs.\n");
				error = true;
				return error;
			}
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
				System.out.println("Change your plan to add new musics.");
				error = true;
			}
		} else {
			error = playlistFounded.addSong(song);
		}
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
		System.out.printf("CPF: %s ", this.cpf);
		System.out.printf("Birthday: " + this.date + " ");
		System.out.printf("Gender: %s - ", this.gender);
		
		if (this.subscriber) {
			System.out.println("PREMIUM USER\n");
		} else {
			System.out.println("COMMON USER\n");
		}
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
	
	public boolean transferPlaylist(User user, String playlistName) {
		
		boolean error = false;
		Playlist playlistTransfered = null;
		
		playlistTransfered = searchPlayList(playlistName);
		if (playlistTransfered == null) {
			error = true;
			return error;
		}
		error = user.addPlaylist(playlistTransfered);
		if (!error) {
			removePlaylist(playlistName);
		}
		
		return error;
		
	}
	
	public boolean playlistInfos(String playlistName) {
		
		Playlist playlist = null;
		boolean error = false;
		
		playlist = searchPlayList(playlistName);
		if (playlist == null) {
			error = true;
		} else {
			System.out.printf("Infos about \"%s\" playlist:\n", playlist.getName());
			System.out.printf("	Shortest songs: %s\n", playlist.shortestSong().getName());
			System.out.printf("	Longest songs: %s\n", playlist.longestSong().getName());
			System.out.printf("	Average songs lenght %.2f minutes\n", playlist.averageLenght());
			System.out.printf("	Lenght total: %.2f minutes\n", playlist.totalLenght());
			System.out.printf("	Principal artist: %s\n", playlist.mostFamousArtist());
		}
		return error;
	}

}
