package com.worship.worshipsongs;

/**
 * Клас-ентіті, де створюється сутність "Пісня"
 * і всі потрібні параметри для неї
 */
public class Song {
    public String songName;

    public Song(String songName) {
        this.songName = songName;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }
}
