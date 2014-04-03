package ru.apache.Sirotin.commands;
import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.MyTree;

import static ru.apache.Sirotin.Main.LOG;
import static ru.apache.Sirotin.Main.readInt;
import static ru.apache.Sirotin.Main.readString;


/**
 * Class implements interface {@link ru.apache.Sirotin.Command}.
 *
 *
 */

public class AddNodeCommand extends AbstractCommand {

    public AddNodeCommand(MyTree tree) {
        super(tree);
    }

    public void execute() {
        System.out.println("Enter parent node id (number before name)");
        int parentId = readInt();
        System.out.println("Enter node name");
        String name = readString();

        if (this.tree.addNode(parentId, name) == false) {
            System.out.println( String.format("There is no node with number  %d", parentId) );
            LOG.error(String.format("Cant create new node. Reason: there is no node with number  %d", parentId));
            return;
        }

        LOG.info( String.format("New node was added. (Parent id : %d, node's name: %s", parentId, name) );
    }
}
