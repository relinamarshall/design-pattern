package com.design.pattern.bridge.example2.devices;

/**
 * Device
 *
 * @author Wenzhou
 * @since 2023/6/14 14:40
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);

    void printStatus();
}
