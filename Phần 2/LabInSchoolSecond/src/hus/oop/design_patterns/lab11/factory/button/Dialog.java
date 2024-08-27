package hus.oop.design_patterns.lab11.factory.button;

public abstract class Dialog {
    public void render() {
        Button button = creatButton();
        button.render();
    }

    public abstract Button creatButton();
}
