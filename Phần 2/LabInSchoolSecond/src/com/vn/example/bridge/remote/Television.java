package com.vn.example.bridge.remote;

public class Television implements Device {
    private int channel;
    private int volume;
    private boolean isEnable;

    public Television() {
        this.channel = 0;
        this.volume = 10;
        this.isEnable = false;
    }

    // việc thực thi lại giao diện của itf device
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
        return isEnable;
    }

    @Override
    public void enable() {
        this.isEnable = true;
    }

    @Override
    public void disable() {
        this.isEnable = false;
    }

    public void setEnable(boolean enable) {
        isEnable = enable;
    }
}
