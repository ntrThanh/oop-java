package hus.oop.design_patterns.lab11.factory.button;

public class WebDialog extends Dialog {
    @Override
    public Button creatButton() {
        return new HTMLButton();
    }
}
