package com.vn.example.factory_method;

public class WebDialog extends Dialog {
    @Override
    public void render() {
        Button htmlButton = creatButton();
        htmlButton.render();
    }

    @Override
    public Button creatButton() {
        return new HTMLButton();
    }
}
