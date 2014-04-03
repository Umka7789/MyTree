package ru.apache.Sirotin.commands;

import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.MyTree;

abstract public class AbstractCommand implements Command {

    public MyTree tree;

    AbstractCommand(MyTree tree) {
        this.tree = tree;
    }

}
