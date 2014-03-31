package ru.apache.Sirotin.commands;

import ru.apache.Sirotin.Command;
import ru.apache.Sirotin.MyTree;

import static ru.apache.Sirotin.Main.LOG;

/**
 * //TODO: setup file headers in IDE settings
 * Created by Администратор on 13.03.14.

 */
public class ChangeRootNodeCommand implements Command {

    private MyTree tree;

	//TODO: у всех команд одинаковый конструктор - логично добавить базовый класс AbstractCommand и вынести этот конструктор
	// и переменную, которую он ставит туда, а в дочерних конструкторах просто дергать super(tree)
    public ChangeRootNodeCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        System.out.println("Command 'Change tree's root node.' is not realized yet.");
        LOG.info("Command Change root node is not realized");
    }


}
