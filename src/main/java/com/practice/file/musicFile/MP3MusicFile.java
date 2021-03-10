package com.practice.file.musicFile;

public class MP3MusicFile extends AbstractMusicFile{
    private int quality;

    public MP3MusicFile(String name, int size, String bandName, String title, int quality) {
        super(name, size, bandName, title);

        this.quality = quality;
    }

    @Override
    public void play() {
        System.out.println("Start playing MP3 file...");
    }


    public int getQuality() {
        return quality;
    }
}
