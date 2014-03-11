package ru.apache.maven;

import java.util.ArrayList;

/**
 * Created by Администратор on 11.03.14.
 */
class Node {

    Node (String name, Node parent, int id) {
        this.name = name;
        this.parent = parent;
        this.id = id;
    }


    public void print(int indent) {

        for (int i = 0; i < indent; i++) {
            System.out.print(" ");
        }
        System.out.println(this.id + ". " + this.name);

        if (this.children.size() != 0) {
            int newIndent = (this.name + this.id).length() + indent + 2;

            for(Node temp: this.children) {
                temp.print(newIndent);
            }
        }
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


    private int id;
    private String name;
    private Node parent;
    private ArrayList<Node> children = new ArrayList<Node>();

}