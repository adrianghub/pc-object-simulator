package com.practice;

import com.practice.drive.HDDDrive;
import com.practice.drive.SSDDrive;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        SSDDrive ssdDrive = new SSDDrive();
        HDDDrive hddDrive = new HDDDrive();

        Computer computer = new Computer(monitor, hddDrive);

        for (String s1 : Arrays.asList("japko1.jpg", "korona1.jpg", "slub1.jpg")) {
            ssdDrive.addFile(new File(s1));
        }
        for (String s : Arrays.asList("chorwacja1.jpg", "kosc1.jpg")) {
            hddDrive.addFile(new File(s));
        }

        System.out.println("SSD Files: ");
        ssdDrive.displayFiles();
        System.out.println();
        System.out.println("HDD Files: ");
        hddDrive.displayFiles();

    }
}
