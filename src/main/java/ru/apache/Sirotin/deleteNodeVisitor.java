package ru.apache.Sirotin;

import static ru.apache.Sirotin.Main.readInt;

public class deleteNodeVisitor implements Visitor {

    public void visit(MyTree tree) {

        System.out.println("Enter  node's id (number before name)");
        int noteId = readInt();

        Node node = tree.getNodeById(noteId);

        if(node == null) {
            System.out.println("There is no node with id" + noteId);
            return;
        }

        if(node == tree.getRootNode()) {
            System.out.println("Cant delete root node!");
            return;
        }

        node.getParent().deleteChild(node);

    }
}
