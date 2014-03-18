package ru.apache.Sirotin;

/**
 * //TODO: setup file headers in IDE settings
 * Created by Администратор on 13.03.14.
 * TODO: read java code convention and fix class name
 */
class changeRootNodeCommand implements Command {

	//TODO: у всех команд одинаковый конструктор - логично добавить базовый класс AbstractCommand и вынести этот конструктор
	// и переменную, которую он ставит туда, а в дочерних конструкторах просто дергать super(tree)
    changeRootNodeCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        System.out.println("Command 'Change tree's root node.' is not realized yet.");
    }

    private MyTree tree;
}
