package ru.apache.Sirotin;
import static ru.apache.Sirotin.Main.readInt;
import static ru.apache.Sirotin.Main.readString;


class changeNodeNameCommand implements Command {

    changeNodeNameCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        System.out.println("Enter  node's id (number before name)");
        int id = readInt();
        System.out.println("Enter new name");
        String name = readString();
        if (this.tree.changeNodeName(name, id) == false)
            System.out.println("There is no node with number " + id);
    }

    private MyTree tree;
}
