package com.vn.example.bridge.remote;

public interface Device {
    // giao diện device cung cấp những chức năng chung nhất của các dịch vụ
    // giao diện này được sử dụng làm cầu nối với giao diện của lớp AbstractRemote
    int getChannel();
    void setChannel(int channel);
    int getVolume();
    void setVolume(int volume);
    boolean isEnable();

    void enable();
    void disable();
}
