package com.vn.example.factory_method;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("button for windows render");
    }

    @Override
    public void onClick() {
        System.out.println("button for windows click");
    }
}
