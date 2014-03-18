package ru.apache.Sirotin;
import static ru.apache.Sirotin.Main.readInt;
import static ru.apache.Sirotin.Main.readString;


//TODO: read java code convention and fix class name
class changeNodeNameCommand implements Command {

	//TODO: у всех команд одинаковый конструктор - логично добавить базовый класс AbstractCommand и вынести этот конструктор
	// и переменную, которую он ставит туда, а в дочерних конструкторах просто дергать super(tree)
    changeNodeNameCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        System.out.println("Enter  node's id (number before name)");
        int id = readInt();
        System.out.println("Enter new name");
        String name = readString();

		//TODO: for boolean values == not necessary, just if(boolean) or if(!boolean)
		//TODO: do not use 'this' pointer, if it is not required
        if (this.tree.changeNodeName(name, id) == false)
			//TODO: use String#format!
            System.out.println("There is no node with number " + id);
    }

    private MyTree tree;
}
