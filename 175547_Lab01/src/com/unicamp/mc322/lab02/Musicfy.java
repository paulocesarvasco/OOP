package com.unicamp.mc322.lab02;

import java.text.ParseException;

/////////////////////////////////////////////////////////////////////////////////
// 																			   //
// Os contrutores das classes foram um pouco alterados da proposta inicial do  //
// do exemplo fornecido, todas as informações do cadastro devem ser fornecidas.//
// Os objetos musicas tambem devem ser instanciados passando todas as infos    //
// necessárias.																   //
// As playlists são adicionadas diretamente a um usuário podendo ser manipula- //
// das de acordo com a proposta inicial.									   //
// O fluxo dessa aplicação pode ser descrito da seguinte maneira maneira:	   //
// Músicas devem ser criadas de forma idependente, operações de criação,       //
// manipulação e transferencia de músicas e playlist devem ser realizadas por  //
// algum usuário.															   //
//																			   //
/////////////////////////////////////////////////////////////////////////////////

public class Musicfy {
	public static void main(String[] args) throws ParseException {

        User user1 = new User("Marcos Paulo", "777.777.777-77", "male", "11/06/1990");
        User user2 = new User("Cookiezi", "111.111.11-11", "female", "03/04/2010");
        
        user1.showInformation();
        user2.showInformation();

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
        
        Song song11 = new Song("Sultans of Swing", "Rock", "Dire Straits", 5.50);
        Song song12 = new Song("Lady Writer", "Rock", "Dire Straits", 3.49);
        Song song13 = new Song("Romeo and Juliet", "Rock", "Dire Straits", 6.05);
        Song song14 = new Song("Tunnel of Love", "Rock", "Dire Straits", 8.14);
        Song song15 = new Song("Private Investigations", "Rock", "Dire Straits", 5.54);
        Song song16 = new Song("Twisting by the Pool", "Rock", "Dire Straits", 3.36);
        Song song17 = new Song("Love over Gold", "Rock", "Dire Straits", 3.40);
        Song song18 = new Song("So Far Away", "Rock", "Dire Straits", 4.03);
        Song song19 = new Song("Money for Nothing", "Rock", "Dire Straits", 4.09);
        Song song20 = new Song("Brothers in Arms", "Rock", "Dire Straits", 4.55);
        Song song21 = new Song("Walk of Life", "Rock", "Dire Straits", 4.12);
        Song song22 = new Song("Calling Elvis", "Rock", "Dire Straits", 4.41);
        Song song23 = new Song("Heavy Fuel", "Rock", "Dire Straits", 5.01);
        Song song24 = new Song("On Every Street", "Rock", "Dire Straits", 4.39);
        Song song25 = new Song("Your Latest Trick", "Rock", "Dire Straits", 5.41);
        Song song26 = new Song("Local Hero-Wild Theme", "Rock", "Dire Straits", 4.23);
        

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
        
        user1.addPlaylist("Sultans of Swing", "Rock");
        user1.addSongToPlaylist("Sultans of Swing", song11);
        user1.addSongToPlaylist("Sultans of Swing", song12);
        user1.addSongToPlaylist("Sultans of Swing", song13);
        user1.addSongToPlaylist("Sultans of Swing", song14);
        user1.addSongToPlaylist("Sultans of Swing", song15);
        user1.addSongToPlaylist("Sultans of Swing", song16);
        user1.addSongToPlaylist("Sultans of Swing", song17);
        user1.addSongToPlaylist("Sultans of Swing", song18);
        user1.addSongToPlaylist("Sultans of Swing", song19);
        user1.addSongToPlaylist("Sultans of Swing", song20);
        user1.addSongToPlaylist("Sultans of Swing", song21);
        
        user1.addPlaylist("Fourth playlist", "Pop");
        user1.showPlaylists();
        
        user1.changePlan();
        
        user1.addSongToPlaylist("Sultans of Swing", song21);
        user1.addSongToPlaylist("Sultans of Swing", song22);
        user1.addSongToPlaylist("Sultans of Swing", song23);
        user1.addSongToPlaylist("Sultans of Swing", song24);
        user1.addSongToPlaylist("Sultans of Swing", song25);
        user1.addSongToPlaylist("Sultans of Swing", song26);
        user1.addPlaylist("Fouth playlist", "Pop");
        System.out.println("");
        user1.showPlaylists();
        
        user1.showInformation();
        System.out.println("");
        user2.showInformation();
        System.out.println("");

        user1.showPlaylists();
        System.out.println("");
        
        user1.playlistInfos("Awesome Rock Songs");
        user1.transferPlaylist(user2, "Awesome Rock Songs");
        user1.transferPlaylist(user2, "Sultans of Swing");
        user2.playlistInfos("Awesome Rock Songs");
        user2.playlistInfos("Osu Memories");
        user1.showPlaylists();
        System.out.println("");
        user2.showPlaylists();

        Song asong1 = user2.playSong("Awesome Rock Songs", true);
        Song asong2 = user2.playSong("Awesome Rock Songs", true);
        Song asong3 = user2.playSong("Osu Memories");
        Song asong4 = user2.playSong("Osu Memories");
        Song asong5 = user1.playSong("Sultans of Swing");
        Song asong6 = user1.playSong("Sultans of Swing", true);
        
        System.out.println("");    
        asong1.showInfo();
        asong2.showInfo();
        asong3.showInfo();
        asong4.showInfo();
        asong5.showInfo();
        asong6.showInfo();
    }
}
