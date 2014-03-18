package ru.apache.Sirotin;
import static ru.apache.Sirotin.Main.readInt;

/**
 * Created by Администратор on 13.03.14.
 * //TODO: read java code convention and fix class name
 */
class changeNodeParCommand implements Command {

	//TODO: у всех команд одинаковый конструктор - логично добавить базовый класс AbstractCommand и вынести этот конструктор
	// и переменную, которую он ставит туда, а в дочерних конструкторах просто дергать super(tree)
	changeNodeParCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        System.out.println("Enter new parent node id (number before name)");
        int parentId = readInt();
        System.out.println("Enter child node id (number before name)");
        int childId = readInt();

        if( this.tree.changeParent(parentId, childId) == false)
            System.out.println("You entered incorrect ids");
    }

    private MyTree tree;
}
