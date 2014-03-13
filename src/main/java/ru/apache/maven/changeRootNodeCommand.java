package ru.apache.maven;

/**
 * Created by Администратор on 13.03.14.
 */
class changeRootNodeCommand implements Command {

    changeRootNodeCommand(MyTree tree) {
        this.tree = tree;
    }

    public void execute() {
        System.out.println("Command 'Change tree's root node.' is not realized yet.");
    }

    private MyTree tree;
}
