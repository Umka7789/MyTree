package ru.apache.Sirotin;

public class MyTree {

    private Node rootNode;
    private int currentId = 0;

    MyTree(String rootNodeName) {
        rootNode = new Node(rootNodeName, null, currentId);
        currentId++;
    }


    public void accept(TreeVisitor visitor) {
        visitor.visit(this);
    }


    public boolean changeParent(int newParentId, int childId) {

        Node newParent = getNodeById(newParentId);

        if(newParent == null)
            return false;

        Node child = getNodeById(childId);

        if(child == null)
            return false;

        if( newParent == child)
            return false;

        Node oldParent = child.getParent();
        oldParent.deleteChild(child);
        newParent.addChild(child);
        return true;

    }


    public boolean addNode (int parentId, String name) {
        Node parentNode = getNodeById(parentId);
        if(parentNode == null)
            return false;

        parentNode.addChild(new Node(name, parentNode, currentId));
        currentId++;
        return true;
    }

    public boolean changeNodeName (String newName, int id) {

        Node node = getNodeById(id);

        if(node == null)
            return false;

        node.setName(newName);
        return true;
    }

    public Node getRootNode() {
        return rootNode;
    }

    public Node getNodeById (int id) {
        return rootNode.getNodeById(id);
    }


}