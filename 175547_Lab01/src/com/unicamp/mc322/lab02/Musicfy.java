package com.unicamp.mc322.lab02;

import java.text.ParseException;

public class Musicfy {
	public static void main(String[] args) throws ParseException {

        User user1 = new User("Marcos Paulo", "777.777.777-77", "male", "11/06/1990");
        User user2 = new User("Cookiezi", "111.111.11-11", "female", "03/04/2010");

        Song song1 = new Song("Seven Nation Army", "Rock", "The White Stripes", 2.3);
        Song song2 = new Song("Crazy Train", "Rock", "Ozzy Osbourne", 3.1);
        Song song3 = new Song("Feels", "Pop", "Calvin Harris", 2.2);
        Song song4 = new Song("Roar", "Pop", "Katy Perry", 1.5);
        Song song5 = new Song("Anima", "Hardcore", "Xi", 3.13);
        Song song6 = new Song("Freedom Dive", "Hardcore", "Xi", 4.32);
        Song song7 = new Song("Teo", "Hardcore", "Omoi", 200);
        Song song8 = new Song("Sleepwalking", "Metalcore", "Bring Me The Horizon", 4.83);
        Song song9 = new Song("Paranoid", "Rock", "Ozzy Osbourne", 1.85);
        Song song10 = new Song("War Pigs", "Rock", "Ozzy Osbourne", 7.56);

        user1.addPlaylist("Awesome Rock Songs", "Rock");
        user1.addSongToPlaylist("Awesome Rock Songs", song1);
        user1.addSongToPlaylist("Awesome Rock Songs", song2);
        user1.addSongToPlaylist("Awesome Rock Songs", song3);
        user1.addSongToPlaylist("Awesome Rock Songs", song4);
        user1.addSongToPlaylist("Awesome Rock Songs", song9);
        user1.addSongToPlaylist("Awesome Rock Songs", song10);
        
        user2.addPlaylist("Osu Memories", "hardcore");
        user2.addSongToPlaylist("Osu Memories", song5);
        user2.addSongToPlaylist("Osu Memories", song6);
        user2.addSongToPlaylist("Osu Memories", song7);

        user1.addPlaylist("Best of Metalcore", "Metalcore");
        user1.addSongToPlaylist("Best of Metalcore", song8);
        
        user1.showInformation();
        System.out.println("");
        user2.showInformation();
        System.out.println("");

        user1.showPlaylists();
        System.out.println("");

        Song asong4 = user1.playSong("Awesome Rock Songs", true);
        Song asong3 = user1.playSong("Awesome Rock Songs", true);
        Song asong1 = user2.playSong("Osu Memories");
        Song asong2 = user2.playSong("Osu Memories");
        
        asong1.showInfo();
        asong2.showInfo();
        asong3.showInfo();
        asong4.showInfo();
        
        user1.playlistInfos("Awesome Rock Songs");
        user1.transferPlaylist(user2, "Awesome Rock Songs");
        user2.playlistInfos("Awesome Rock Songs");
        user2.playlistInfos("Osu Memories");
        user1.showPlaylists();
        System.out.println("");
        user2.showPlaylists();
        
        
    }
}
