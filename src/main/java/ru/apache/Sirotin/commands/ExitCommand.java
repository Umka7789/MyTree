package ru.apache.Sirotin.commands;
import ru.apache.Sirotin.Command;

import static ru.apache.Sirotin.Main.exitProgram;


public class ExitCommand implements Command {

    public void execute() {
        exitProgram();
    }
}
