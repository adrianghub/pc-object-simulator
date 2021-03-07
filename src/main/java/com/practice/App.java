package com.practice;

public class App {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        System.out.println(monitor.getResolution());

        monitor.setLowResolution();
        System.out.println(monitor.getResolution());
    }
}
