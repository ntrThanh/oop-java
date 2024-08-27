package hus.oop.design_patterns.lab11.factory.button;

public class WindowDialog extends Dialog {
    @Override
    public Button creatButton() {
        return new WindowButton();
    }
}
