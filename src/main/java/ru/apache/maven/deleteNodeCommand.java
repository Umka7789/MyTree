package ru.apache.maven;
import static ru.apache.maven.Main.readInt;
import static ru.apache.maven.Main.readString;

/**
 * Created by Администратор on 13.03.14.
 */
class deleteNodeCommand implements Command {

    deleteNodeCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        System.out.println("Enter  node's id (number before name)");
        int id = readInt();
        if (this.tree.deleteNode(id) == false)
            System.out.println("There is no node with number " + id);
    }

    private MyTree tree;
}
