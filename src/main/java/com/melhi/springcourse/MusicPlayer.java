package com.melhi.springcourse;

public class MusicPlayer {
    private Music music;

    //Inversion Of Control// create dependencies outside
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public void playMusic() {
        System.out.println("Playing song is: " + music.getSong());
    }
}
