package com.vn.example.bridge.remote;

public class Remote extends AbstractRemote {
    public Remote(Device device) {
        super(device);
    }

    public void mute() {
        this.device.setVolume(0);
    }
}
