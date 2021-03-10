package com.practice;

import com.practice.drive.Drive;
import com.practice.drive.HDDDrive;
import com.practice.drive.SSDDrive;
import com.practice.file.File;
import com.practice.file.imageFile.GIFImageFile;
import com.practice.file.imageFile.JPGImageFile;
import com.practice.file.musicFile.MP3MusicFile;

public class App {
    public static void main(String[] args) {
        GIFImageFile gifImageFile = new GIFImageFile("image.gif", 100);
        JPGImageFile jpgImageFile = new JPGImageFile("image.jpg", 320, 40);
        MP3MusicFile mp3MusicFile = new MP3MusicFile("music.mp3", 2000, "Gracjan", "Pain in the Jungle", 50);

        Drive ssdDrive = new SSDDrive();
        Drive hddDrive = new HDDDrive();

        ssdDrive.addFile(gifImageFile);
        ssdDrive.addFile(jpgImageFile);
        ssdDrive.addFile(mp3MusicFile);

        ssdDrive.displayFiles();
        File file = ssdDrive.findFile("image.jpg");

        System.out.println(file.getSize());
    }
}
