package hus.oop.design_patterns.lab11.factory.button;

import java.util.Scanner;

public class App {
    private static Dialog dialog;

    public static void initialize() throws Exception {
        Scanner sc = new Scanner(System.in);
        String config = sc.nextLine();

        if (config.equals("Window")) {
            dialog = new WindowDialog();
        } else if (config.equals("web")) {
            dialog = new WebDialog();
        } else {
            throw new Exception("error! unknown operating system");
        }
    }

    public static void main(String[] args) throws Exception {
        initialize();
        dialog.render();
    }
}
