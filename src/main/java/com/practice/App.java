package com.practice;

import com.practice.drive.Drive;
import com.practice.drive.HDDDrive;
import com.practice.drive.SSDDrive;
import com.practice.file.File;
import com.practice.file.imageFile.GIFImageFile;
import com.practice.file.imageFile.JPGImageFile;
import com.practice.file.musicFile.MP3MusicFile;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        GIFImageFile gifImageFile = new GIFImageFile("cat.gif", 100);
        JPGImageFile jpgImageFile = new JPGImageFile("image.jpg", 320, 40);
        MP3MusicFile mp3MusicFile = new MP3MusicFile("music.mp3", 2000, "Gracjan", "Pain in the Jungle", 50);

        Drive ssdDrive = new SSDDrive();
        Drive hddDrive = new HDDDrive();

        ssdDrive.addFile(gifImageFile);
        ssdDrive.addFile(jpgImageFile);
        ssdDrive.addFile(mp3MusicFile);

        ssdDrive.displayFiles();
        File fileToFind = ssdDrive.findFile("image.jpg");

        System.out.println(fileToFind.getSize());


        List<File> files = new ArrayList<>();
        files.add(jpgImageFile);
        files.add(gifImageFile);

        for (File file : files) {
            if (file instanceof JPGImageFile) {
                System.out.println(file.getName() + " is JPG image file");
            } else if (file instanceof  GIFImageFile){
                System.out.println(file.getName() + " is GIF image file");
            }
        }
    }
}
