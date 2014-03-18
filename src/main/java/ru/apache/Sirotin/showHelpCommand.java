package ru.apache.Sirotin;
import static ru.apache.Sirotin.Main.printMenu;

//TODO: read java code convention and fix class name
class showHelpCommand implements Command {

    public void execute() {
        printMenu();
    }
}
