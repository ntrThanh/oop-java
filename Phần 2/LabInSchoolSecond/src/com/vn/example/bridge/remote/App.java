package com.vn.example.bridge.remote;

public class App {
    public static void main(String[] args) {
        Device television = new Television();

        Remote remote = new Remote(television);
        System.out.println(television.isEnable());

        remote.clickButtonPower();
        System.out.println(television.isEnable());

        remote.clickButtonPower();
        System.out.println(television.isEnable());
    }
}
