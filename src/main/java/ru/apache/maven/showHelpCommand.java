package ru.apache.maven;
import static ru.apache.maven.Main.printMenu;

class showHelpCommand implements Command {

    public void execute() {
        printMenu();
    }
}
