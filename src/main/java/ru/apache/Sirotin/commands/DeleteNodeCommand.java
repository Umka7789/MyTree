package ru.apache.Sirotin.commands;

import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.treeVisitors.DeleteNodeVisitor;
import ru.apache.Sirotin.MyTree;

import static ru.apache.Sirotin.Main.LOG;


public class DeleteNodeCommand extends AbstractCommand {


    public DeleteNodeCommand(MyTree tree) {
        super(tree);
    }

    public void execute() {
        tree.accept(new DeleteNodeVisitor());
    }


}
