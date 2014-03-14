package ru.apache.Sirotin;

/**
 * Created by Администратор on 11.03.14.
 */
class MyTree {


    MyTree(String rootNodeName) {
        this.rootNode = new Node(rootNodeName, null, this.currentId);
        this.currentId++;
    }


    public void accept(Visitor visitor) {
        visitor.visit(this);
    }


    public boolean changeParent(int newParentId, int childId) {

        Node newParent = this.getNodeById(newParentId);

        if(newParent == null)
            return false;

        Node child = this.getNodeById(childId);

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
        Node parentNode = this.getNodeById(parentId);
        if(parentNode == null)
            return false;

        parentNode.addChild(new Node(name, parentNode, this.currentId));
        this.currentId++;
        return true;
    }


    public void printTree() {
        System.out.println("");
        System.out.println("********** Our tree ***********");
        this.rootNode.print(0);
        System.out.println("*******************************");
        System.out.println("");
    }


    public boolean changeNodeName (String newName, int id) {

        Node node = this.getNodeById(id);

        if(node == null)
            return false;

        node.setName(newName);
        return true;
    }

    Node getRootNode() {
        return this.rootNode;
    }

    Node getNodeById (int id) {
        return this.rootNode.getNodeById(id);
    }

    private Node rootNode;
    private int currentId = 0;
}