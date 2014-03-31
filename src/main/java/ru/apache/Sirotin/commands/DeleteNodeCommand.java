package ru.apache.Sirotin.commands;

import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.treeVisitors.DeleteNodeVisitor;
import ru.apache.Sirotin.MyTree;

import static ru.apache.Sirotin.Main.LOG;

/**
 * Created by Администратор on 13.03.14.

 */
public class DeleteNodeCommand implements Command {

    private MyTree tree;

	//TODO: у всех команд одинаковый конструктор - логично добавить базовый класс AbstractCommand и вынести этот конструктор
	// и переменную, которую он ставит туда, а в дочерних конструкторах просто дергать super(tree)
    public DeleteNodeCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        tree.accept(new DeleteNodeVisitor());
    }


}
