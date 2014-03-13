package ru.apache.Sirotin;
import static ru.apache.Sirotin.Main.readInt;

/**
 * Created by Администратор on 13.03.14.
 */
class changeNodeParCommand implements Command {

    changeNodeParCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        System.out.println("Enter new parent node id (number before name)");
        int parentId = readInt();
        System.out.println("Enter child node id (number before name)");
        int childId = readInt();

        if( this.tree.changeParent(parentId, childId) == false)
            System.out.println("You entered incorrect ids");
    }

    private MyTree tree;
}
