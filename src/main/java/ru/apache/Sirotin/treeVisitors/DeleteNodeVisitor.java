package ru.apache.Sirotin.treeVisitors;

import ru.apache.Sirotin.MyTree;
import ru.apache.Sirotin.Node;
import ru.apache.Sirotin.TreeVisitor;

import static ru.apache.Sirotin.Main.LOG;
import static ru.apache.Sirotin.Main.readInt;


public class DeleteNodeVisitor implements TreeVisitor {

    public void visit(MyTree tree) {

        System.out.println("Enter  node's id (number before name)");
        int nodeId = readInt();

        Node node = tree.getNodeById(nodeId);

        if(node == null) {
            System.out.println( String.format("There is no node with id: %d", nodeId) );
            LOG.error( String.format("Cant delete node. Reason: there is no node with id: %d", nodeId) );
            return;
        }

        if(node == tree.getRootNode()) {
            System.out.println("Cant delete root node!");
            LOG.error(String.format("Cant delete node with id: %d. Reason: it is root node of the tree.", nodeId));
            return;
        }

        node.getParent().deleteChild(node);

        LOG.info( String.format("Node was deleted. (Node's id: %d)", nodeId) );

    }
}
