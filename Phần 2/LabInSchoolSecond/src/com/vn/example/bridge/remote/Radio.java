package com.vn.example.bridge.remote;

public class Radio implements Device {
    private int channel;
    private int volume;
    private boolean isEnable;

    @Override
    public void enable() {
        this.isEnable = true;
    }

    @Override
    public void disable() {
        this.isEnable = false;
    }

    public Radio() {
        this.channel = 0;
        this.volume = 10;
        this.isEnable = false;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public boolean isEnable() {
        return false;
    }
}
