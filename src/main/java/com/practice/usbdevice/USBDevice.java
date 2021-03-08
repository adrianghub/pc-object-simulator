package com.practice.usbdevice;

public interface USBDevice {
    boolean connect();
    boolean disconnect();
    String getName();
}
