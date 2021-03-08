package com.practice.usbdevice;

public class MemoryStick implements USBDevice {
    private String name;
    private boolean ejected = false;

    public MemoryStick(String name) {
        this.name = name;
    }

    @Override
    public boolean connect() {
        System.out.println("Connected Memory Stick");
        return false;
    }

    @Override
    public boolean disconnect() {
        if (!ejected) {
            System.out.println("First eject Memory Stick...");
            return false;
        } else {
            System.out.println("Memory Stick disconnected");
            return true;
        }
    }

    public void eject() {
        System.out.println("Ejecting Memory Stick");
        ejected = true;
    }

    @Override
    public String getName() {
        return null;
    }
}
