package ru.apache.maven;

/**
 * Created by Администратор on 11.03.14.
 */
class MyTree {


    MyTree(String rootNodeName) {
        this.rootNode = new Node(rootNodeName, null, this.currentId);
        this.currentId++;
    }


   public boolean deleteNode(int noteId) {

       Node node = this.getNodeById(noteId);
       if(node == null)
           return false;

       if(node == this.rootNode)
           return false;

       node.getParent().deleteChild(node);
       return true;
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

    private Node getNodeById (int id) {
        return this.rootNode.getNodeById(id);
    }

    private Node rootNode;
    private int currentId = 0;
}