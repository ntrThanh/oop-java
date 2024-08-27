package com.vn.example.factory_method;

public class WindowsDialog extends Dialog {
    @Override
    public Button creatButton() {
        return new WindowsButton();
    }
}
