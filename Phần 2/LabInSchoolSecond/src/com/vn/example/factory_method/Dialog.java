package com.vn.example.factory_method;

public abstract class Dialog {
    public void render() {
        Button button = creatButton();
        button.render();
    }

    public abstract Button creatButton();
}
