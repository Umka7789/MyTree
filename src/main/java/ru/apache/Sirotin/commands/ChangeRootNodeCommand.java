package ru.apache.Sirotin.commands;

import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.MyTree;

import static ru.apache.Sirotin.Main.LOG;


public class ChangeRootNodeCommand extends AbstractCommand {

    public ChangeRootNodeCommand(MyTree tree) {
        super(tree);
    }

    public void execute() {
        System.out.println("Command 'Change tree's root node.' is not realized yet.");
        LOG.info("Command 'Change tree's root node' is not realized");
    }


}
