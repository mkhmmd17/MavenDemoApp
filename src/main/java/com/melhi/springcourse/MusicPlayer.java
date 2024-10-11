package com.melhi.springcourse;

import java.util.ArrayList;
import java.util.List;

public class MusicPlayer {

    private Music music;
    //Inversion Of Control// create dependencies outside
    public MusicPlayer(Music music) {
        this.music = music;
    }
    private String name;
    private int volume;

    public MusicPlayer() {}

   private List<Music> musicList = new ArrayList<>();


    public void setMusic(Music music) {
        this.music = music;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setMusicList(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        for (Music music : musicList){
            System.out.println("Playing song is: " + music.getSong());
        }
    }
}
