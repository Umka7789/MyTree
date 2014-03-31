package ru.apache.Sirotin;


class MenuItem {

    private Command command;
    private String name;

    MenuItem(Command cmd, String name) {
        this.command = cmd;
        this.name = name;
    }

    void executeCommand() {
        command.execute();
    }

    String getName() {
        return name;
    }

}
