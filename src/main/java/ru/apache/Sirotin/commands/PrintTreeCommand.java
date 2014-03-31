package ru.apache.Sirotin.commands;


import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.MyTree;
import ru.apache.Sirotin.treeVisitors.PrintTreeVisitor;

public class PrintTreeCommand implements Command {

    private MyTree tree;

    public PrintTreeCommand(MyTree tree) {
       this.tree = tree;
   }

    public void execute() {
        tree.accept(new PrintTreeVisitor());
    }

}
