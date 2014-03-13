package ru.apache.maven;
import static ru.apache.maven.Main.readInt;
import static ru.apache.maven.Main.readString;





/**
 * Created by Администратор on 13.03.14.
 */
class addNodeCommand implements Command {

    private MyTree tree;

    addNodeCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        System.out.println("Enter parent node id (number before name)");
        int parentId = readInt();
        System.out.println("Enter node name");
        String name = readString();

        if (this.tree.addNode(parentId, name) == false)
            System.out.println("There is no node with number " + parentId);
    }
}
