package ru.apache.Sirotin.commands;
import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.MyTree;

import static ru.apache.Sirotin.Main.LOG;
import static ru.apache.Sirotin.Main.readInt;
import static ru.apache.Sirotin.Main.readString;



public class ChangeNodeNameCommand extends AbstractCommand {

    public ChangeNodeNameCommand(MyTree tree) {
        super(tree);
    }

    public void execute() {
        System.out.println("Enter  node's id (number before name)");
        int id = readInt();
        System.out.println("Enter new name");
        String name = readString();
        if (tree.changeNodeName(name, id) == false) {
            System.out.println(String.format("There is no node with number %d", id));
            LOG.error(String.format("Cant change node's name. Reason: there is no node with number %d", id));
            return;
        }

        LOG.info( String.format("Node's name was changed. (Node's id: %d, New name: %s", id, name) );
    }


}
