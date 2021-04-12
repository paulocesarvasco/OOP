package com.unicamp.mc322.lab02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
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
	
	// A implementação do método de ordenação da lista foi retirada do stackoverflow
	private void sortPlaylist() {
		Collections.sort(songs, new Comparator<Song>() {
		      public int compare(final Song song1, final Song song2) {
		          return song1.getName().compareTo(song2.getName());
		      }
		  });
	}
	
	public String getName() {
		return this.name;
	}
	
	public int playlistSize() {
		return this.songs.size();
	}
	
	public int size() {
		return this.songs.size();
	}
	
	public boolean addSong(Song song) {
		
		boolean error = false;
		
		error = !this.songs.add(song);
		if (error) {
			System.out.printf("Error to add new music in playlist. ");
		}
		sortPlaylist();
		return error;
	}
	
	public boolean removeSong(Song song) {
		
		boolean error = false;
		Song songRemoved = null;

		songRemoved = searchSong(song.getName());
		if (songRemoved == null) {
			error = true;
			return error;
		}
		this.songs.remove(songRemoved);
		return error;
	}
	
	private Song searchSong(String songName) {
		
		boolean itemFounded = false;
		Song SongFound = null;

		for (Song searchedSong : this.songs) {
			if (Objects.equals(searchedSong.getName(), songName)) {
				SongFound = searchedSong;
				itemFounded = true;
			}
		}
		if (!itemFounded) {
			System.out.printf("Song not found. ");
		}
		return SongFound;
	}
	
	public boolean showSongs(int index) {
		
		boolean error = false;
		System.out.printf("Playlist %d: %s\n", index, this.name);
		System.out.printf("		Rhythm: %s\n", this.rhythm);
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

	public Song shortestSong() {
		
		Song shortestSong = new Song ("", "", "", 1000000000);
		for (Song song : this.songs) {
			if (song.getDuration() <= shortestSong.getDuration()) {
				shortestSong = song;
			}
		}
		return shortestSong;
	}
	
	public Song longestSong() {
		
		Song longestSong = new Song ("", "", "", 0);
		for (Song song : this.songs) {
			if (song.getDuration() > longestSong.getDuration()) {
				longestSong = song;
			}
		}
		return longestSong;
	}
	
	public float averageLenght() {
		
		float lenght = 0;

		for (Song song : this.songs) {
			lenght += song.getDuration();
		}
		lenght /= this.songs.size();
		
		return lenght;
	}
	
	public float totalLenght() {
		
		float lenght = 0;

		for (Song song : this.songs) {
			lenght += song.getDuration();
		}
		
		return lenght;
	}
	
	public String mostFamousArtist() {
		
		List<Artist> artists = new ArrayList<Artist>();
		Artist artist = new Artist();
		boolean artistFound = false;
		
		for (Song song : this.songs) {
			if (artists.isEmpty()) {
				artist.setName(song.getArtist());
				artist.setOccurrences();
				artists.add(artist);
			} else {
				for (Artist checkArtist : artists) {
					if (Objects.equals(checkArtist.getName(), song.getArtist())) {
						artist.setOccurrences();
						artistFound = true;
					}
				}
				if (!artistFound) {
					artist.setName(song.getArtist());
					artist.setOccurrences();
					artists.add(artist);
				}
			}
		}
		artist.zeroOccurrences();
		for (Artist checkArtist : artists) {
			if (artist.getOccurrences() < checkArtist.getOccurrences()) {
				artist = checkArtist;
			}
		}
		
		return artist.getName();
	}
	
	
}
