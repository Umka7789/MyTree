package ru.apache.Sirotin;

/**
 * Created by Администратор on 13.03.14.
 */
class MenuItem {

    MenuItem(Command cmd, String name) {
        this.command = cmd;
        this.name = name;
    }

    void executeCommand() {
        this.command.execute();
    }

    String getName() {
        return this.name;
    }
    private Command command;
    private String name;
}
