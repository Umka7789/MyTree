package ru.apache.Sirotin.commands;
import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.MyTree;

import static ru.apache.Sirotin.Main.LOG;
import static ru.apache.Sirotin.Main.readInt;


public class ChangeNodeParCommand implements Command {

    private MyTree tree;

	//TODO: у всех команд одинаковый конструктор - логично добавить базовый класс AbstractCommand и вынести этот конструктор
	// и переменную, которую он ставит туда, а в дочерних конструкторах просто дергать super(tree)
	public ChangeNodeParCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        System.out.println("Enter new parent node id (number before name)");
        int parentId = readInt();
        System.out.println("Enter child node id (number before name)");
        int childId = readInt();

        if( this.tree.changeParent(parentId, childId) == false)
            System.out.println("You entered incorrect ids");

        LOG.info("Node's parent was changed.");
    }


}
