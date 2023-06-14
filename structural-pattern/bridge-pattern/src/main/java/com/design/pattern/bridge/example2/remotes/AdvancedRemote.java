package com.design.pattern.bridge.example2.remotes;

import com.design.pattern.bridge.example2.devices.Device;

/**
 * AdvancedRemote
 *
 * @author Wenzhou
 * @since 2023/6/14 14:44
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
