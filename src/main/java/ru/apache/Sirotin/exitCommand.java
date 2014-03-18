package ru.apache.Sirotin;
import static ru.apache.Sirotin.Main.exitProgram;


//TODO: read java code convention and fix class name
class exitCommand implements Command {

    public void execute() {
        exitProgram();
    }
}
