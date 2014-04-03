package ru.apache.Sirotin.commands;


import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.MyTree;
import ru.apache.Sirotin.treeVisitors.PrintTreeVisitor;

public class PrintTreeCommand extends AbstractCommand {


    public PrintTreeCommand(MyTree tree) {
       super(tree);
   }

    public void execute() {
        tree.accept(new PrintTreeVisitor());
    }

}
