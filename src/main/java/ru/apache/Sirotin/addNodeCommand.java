package ru.apache.Sirotin;
import static ru.apache.Sirotin.Main.readInt;
import static ru.apache.Sirotin.Main.readString;





/**
 * Class implements interface {@link ru.apache.Sirotin.Command}.
 *
 */
class addNodeCommand implements Command {

    /**
     * Object of a class {@link ru.apache.Sirotin.MyTree},
     */

    private MyTree tree;


    /**
     * Constructor initialize field {@link ru.apache.Sirotin.addNodeCommand#tree}
     */

    addNodeCommand(MyTree tree) {
        this.tree = tree;
    }


    /**
     * Method ask user to input id of any existing node and name of a new node.
     * ID and name uses to call  {@link ru.apache.Sirotin.MyTree#addNode(int, String)}
     */

    public void execute() {
        System.out.println("Enter parent node id (number before name)");
        int parentId = readInt();
        System.out.println("Enter node name");
        String name = readString();

        if (this.tree.addNode(parentId, name) == false)
            System.out.println("There is no node with number " + parentId);
    }
}
