package ru.apache.Sirotin.nodeVisitors;

import ru.apache.Sirotin.NodeVisitor;
import ru.apache.Sirotin.Node;

public class PrintVisitor implements NodeVisitor {

    private int indent = 0;

    public PrintVisitor(int indent) {
        this.indent = indent;
    }

    public void visit (Node node) {

        for (int i = 0; i < indent; i++) {
            System.out.print(" ");
        }
        System.out.println(node.getId() + ". " + node.getName());

        if (node.getChildren().size() != 0) {
            int newIndent = (node.getName() + node.getId()).length() + indent + 2;

            for(Node temp: node.getChildren()) {
                temp.accept(new PrintVisitor(newIndent));
            }
        }
    }
}
