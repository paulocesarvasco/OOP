package com.unicamp.mc322.lab02;

public class Musicfy {
	public static void main(String[] args) {

        User user1 = new User("Marcos Paulo", "777.777.777-77");
        User user2 = new User("Cookiezi", "111.111.11-11");

        Song song1 = new Song("Seven Nation Army", "Rock", "The White Stripes");
        Song song2 = new Song("Crazy Train", "Rock", "Ozzy Osbourne");
        Song song3 = new Song("Feels", "Pop", "Calvin Harris");
        Song song4 = new Song("Roar", "Pop", "Katy Perry");
        Song song5 = new Song("Anima", "Hardcore", "Xi");
        Song song6 = new Song("Freedom Dive", "Hardcore", "Xi");
        Song song7 = new Song("Teo", "Hardcore", "Omoi");
        Song song8 = new Song("Sleepwalking", "Metalcore", "Bring Me The Horizon");

        user1.addPlaylist("Awesome Rock Songs", "Rock");
        user1.addSongToPlaylist("Awesome Rock Songs", song1);
        user1.addSongToPlaylist("Awesome Rock Songs", song2);
        user1.addSongToPlaylist("Awesome Rock Songs", song3);
        user1.addSongToPlaylist("Awesome Rock Songs", song4);
        
        user2.addPlaylist("Osu Memories", "hardcore");
        user2.addSongToPlaylist("Osu Memories", song5);
        user2.addSongToPlaylist("Osu Memories", song6);
        user2.addSongToPlaylist("Osu Memories", song7);

        user1.addPlaylist("Best of Metalcore", "Metalcore");
        user1.addSongToPlaylist("Best of Metalcore", song8);

        user1.showPlaylists();
        System.out.println("");
        user2.showInformation();

        Song asong4 = user1.playSong("Awesome Rock Songs", true);
        Song asong3 = user1.playSong("Awesome Rock Songs", true);
        Song asong1 = user2.playSong("Osu Memories");
        Song asong2 = user2.playSong("Osu Memories");
        
        
    }
}
