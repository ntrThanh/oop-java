package hus.oop.design_patterns.lab11.abstractfactory.button;

import java.util.Scanner;

public class OsSystem {
    private String name;

    public OsSystem() {
        this.name = new Scanner(System.in).nextLine();
    }

    public String Os() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
