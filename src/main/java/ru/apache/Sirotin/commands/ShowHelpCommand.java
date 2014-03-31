package ru.apache.Sirotin.commands;
import ru.apache.Sirotin.Command;

import static ru.apache.Sirotin.Main.printMenu;


public class ShowHelpCommand implements Command {

    public void execute() {
        printMenu();
    }
}
