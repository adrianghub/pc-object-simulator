package com.practice.file.imageFile;

import com.practice.file.File;
import com.practice.file.FileType;

public class JPGImageFile implements File {
    private final FileType fileType;
    private String name;
    private int size;
    private int compression;

    public JPGImageFile(String name, int size, FileType fileType, int compression) {
        this.fileType = fileType;
        this.compression = compression;
        this.name = name;
        this.size = size;
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
        return this.fileType;
    }

    public int getCompression() {
        return compression;
    }

    public void displayImage() {
        System.out.println("Displaying JPG...");
    }
}
