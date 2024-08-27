package com.vn.example.factory_method;

public class HTMLButton implements Button {
    @Override
    public void render() {
        System.out.println("button for html render");
    }

    @Override
    public void onClick() {
        System.out.println("button for html click");
    }
}
