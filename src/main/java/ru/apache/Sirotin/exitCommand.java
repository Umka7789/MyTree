package ru.apache.Sirotin;
import static ru.apache.Sirotin.Main.exitProgram;


class exitCommand implements Command {

    public void execute() {
        exitProgram();
    }
}
