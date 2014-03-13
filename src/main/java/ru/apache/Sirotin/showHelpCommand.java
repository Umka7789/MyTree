package ru.apache.Sirotin;
import static ru.apache.Sirotin.Main.printMenu;

class showHelpCommand implements Command {

    public void execute() {
        printMenu();
    }
}
