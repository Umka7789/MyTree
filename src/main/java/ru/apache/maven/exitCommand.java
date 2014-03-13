package ru.apache.maven;
import static ru.apache.maven.Main.exitProgram;


class exitCommand implements Command {

    public void execute() {
        exitProgram();
    }
}
