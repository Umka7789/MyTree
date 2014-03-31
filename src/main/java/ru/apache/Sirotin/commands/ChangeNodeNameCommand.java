package ru.apache.Sirotin.commands;
import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.MyTree;

import static ru.apache.Sirotin.Main.LOG;
import static ru.apache.Sirotin.Main.readInt;
import static ru.apache.Sirotin.Main.readString;



public class ChangeNodeNameCommand implements Command {

    private MyTree tree;

	//TODO: у всех команд одинаковый конструктор - логично добавить базовый класс AbstractCommand и вынести этот конструктор
	// и переменную, которую он ставит туда, а в дочерних конструкторах просто дергать super(tree)
    public ChangeNodeNameCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        System.out.println("Enter  node's id (number before name)");
        int id = readInt();
        System.out.println("Enter new name");
        String name = readString();
        if (tree.changeNodeName(name, id))
            System.out.println(String.format("There is no node with number %1$d", id));
        LOG.info("Node name was changed");
    }


}
