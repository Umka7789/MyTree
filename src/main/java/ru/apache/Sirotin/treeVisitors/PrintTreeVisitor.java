package ru.apache.Sirotin.treeVisitors;

import ru.apache.Sirotin.TreeVisitor;
import ru.apache.Sirotin.MyTree;
import ru.apache.Sirotin.nodeVisitors.PrintVisitor;

import static ru.apache.Sirotin.Main.LOG;

public class PrintTreeVisitor implements TreeVisitor{

    public void visit(MyTree tree) {
        System.out.println("");
        System.out.println("********** Our tree ***********");
        tree.getRootNode().accept(new PrintVisitor(0));
        System.out.println("*******************************");
        System.out.println("");
        LOG.info("Tree was printed on the screen");
    }
}
