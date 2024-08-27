package com.vn.example.bridge.remote;

public class AbstractRemote {
    // lấy biến Device trong AbsRemote để làm cầu nối giữa hai thiết bị;
    protected Device device;

    public AbstractRemote(Device device) {
        this.device = device;
    }

    // thay vì mỗi một device lại có một cái remote thì ta dùng chung cái remote cho nhiê dịch vụ
    // mỗi device có một cách thức mở khác nhau nên cần hai giao diện chung nhất để có thể nhất quán được cách dịch vụ
    // các phương thức trong lớp này sẽ chỉ sử dụng giao diện mà interface cung cấp, việc triển khai giao diện đó như
    // thể nào thì để các lớp con implement (nói cách khác là ghi đè) lại của itf sẽ thực thi

    // đây là các phương thức của giao diện mà device cung cấp
    public void clickButtonPower() {
        if (device.isEnable()) {
            this.device.disable();
        } else {
            this.device.enable();
        }
    }

    public void channelUp() {
        this.device.setChannel(this.device.getChannel() + 1);
    }

    public void channelDown() {
        this.device.setChannel(this.device.getChannel() - 1);
    }

    public void volumeUp() {
        this.device.setVolume(this.device.getVolume() + 1);
    }

    public void volumeDown() {
        this.device.setVolume(this.device.getVolume() - 1);
    }
}
