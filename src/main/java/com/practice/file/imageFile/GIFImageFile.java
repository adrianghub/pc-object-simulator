package com.practice.file.imageFile;

public class GIFImageFile extends AbstractImageFile {


    public GIFImageFile(String name, int size) {
        super(name, size);
    }

    public void displayAnimation() {
        System.out.println("Displaying dummy GIF...");
    }
}
