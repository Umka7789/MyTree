package ru.apache.Sirotin.commands;
import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.MyTree;

import static ru.apache.Sirotin.Main.LOG;
import static ru.apache.Sirotin.Main.readInt;


public class ChangeNodeParCommand extends AbstractCommand {


	public ChangeNodeParCommand(MyTree tree) {
        super(tree);
    }

    public void execute() {
        System.out.println("Enter new parent node id (number before name)");
        int parentId = readInt();
        System.out.println("Enter child node id (number before name)");
        int childId = readInt();

        if( this.tree.changeParent(parentId, childId) == false) {
            System.out.println("You entered incorrect ids");
            LOG.error("Cant change node's parent. Reason: user entered incorrect id.");
            return;
        }

        LOG.info( String.format("Node's parent was changed. (Child's id: %d, New parent id: %d", childId, parentId) );
    }


}
