package hus.oop.design_patterns.lab11.visitor.computer;

import java.util.LinkedList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<ComputerPart> list = new LinkedList<>();
        Mouse mouse = new Mouse();
        Monitor monitor = new Monitor();
        KeyBoard keyBoard = new KeyBoard();
        Computer computer = new Computer(new ComputerPart[]{monitor, keyBoard,
                monitor, mouse,
                new Computer(new ComputerPart[]{mouse, monitor, keyBoard})});
        list.add(mouse);
        list.add(monitor);

        for (ComputerPart computerPart : list) {
            computerPart.accept(new ComputerPartDisplayVisitor());
        }
    }
}
