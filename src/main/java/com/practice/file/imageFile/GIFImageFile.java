package com.practice.file.imageFile;

import com.practice.file.File;
import com.practice.file.FileType;

public class GIFImageFile implements File {
    private String name;
    private int size;
    private final FileType fileType;

    public GIFImageFile(String name, int size, FileType fileType) {
        this.name = name;
        this.size = size;
        this.fileType = fileType;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public FileType getType() {
        return null;
    }

    public void displayAnimation() {
        System.out.println("Displaying dummy GIF...");
    }
}
