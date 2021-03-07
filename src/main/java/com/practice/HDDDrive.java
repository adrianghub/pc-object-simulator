package com.practice;

import java.util.ArrayList;
import java.util.List;

public class HDDDrive implements Drive {

    List<File> files = new ArrayList<>();

    @Override
    public void addFile(File file) {
        files.add(file);
    }

    @Override
    public void displayFiles() {
        for (File file: files) {
            System.out.println(file);
        }

        //        files.forEach(System.out::println);
    }

    @Override
    public File findFile(String name) {
        return null;
    }
}
