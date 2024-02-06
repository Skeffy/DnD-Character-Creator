package org.dndcharacter;

public class Application {

    public static void main(String[] args) {
        Console console = new Console();
        Controller controller = new Controller(console);
        controller.run();
    }
}