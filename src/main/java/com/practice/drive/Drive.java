package com.practice.drive;

import com.practice.File;

public interface Drive {
    void addFile(File file);
    void displayFiles();
    File findFile(String name);
}
