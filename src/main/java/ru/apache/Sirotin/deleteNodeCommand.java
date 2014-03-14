package ru.apache.Sirotin;
import static ru.apache.Sirotin.Main.readInt;

/**
 * Created by Администратор on 13.03.14.
 */
class deleteNodeCommand implements Command {

    deleteNodeCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        tree.accept(new deleteNodeVisitor());
    }

    private MyTree tree;
}
