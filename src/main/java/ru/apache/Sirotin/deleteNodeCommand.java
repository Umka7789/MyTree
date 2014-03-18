package ru.apache.Sirotin;
/**
 * Created by Администратор on 13.03.14.
 * TODO: read java code convention and fix class name
 */
class deleteNodeCommand implements Command {

	//TODO: у всех команд одинаковый конструктор - логично добавить базовый класс AbstractCommand и вынести этот конструктор
	// и переменную, которую он ставит туда, а в дочерних конструкторах просто дергать super(tree)
    deleteNodeCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        tree.accept(new deleteNodeVisitor());
    }

    private MyTree tree;
}
