package ru.apache.Sirotin;

import java.util.ArrayList;


public class Node {

    private int id;
    private String name;
    private Node parent;
    private ArrayList<Node> children = new ArrayList<Node>();

    Node (String name, Node parent, int id) {
        this.name = name;
        this.parent = parent;
        this.id = id;
    }

    public void accept(NodeVisitor visitor) {
        visitor.visit(this);
    }


    public Node getNodeById (int id) {
        if (this.id == id)
            return this;
        else {
            for(Node temp : this.children) {
                if (temp.getNodeById(id) != null)
                    return temp.getNodeById(id);
            }
        }

        return null;
    }

    public ArrayList<Node> getChildren() {
        return children;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setParent(Node newParent){
        this.parent = newParent;
    }

    public int getId(){
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void deleteChild(Node child) {
        this.children.remove(child);
    }

    public void addChild (Node child) {
        this.children.add(child);
    }

    public Node getParent() {
        return this.parent;
    }

}