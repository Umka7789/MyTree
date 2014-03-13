package ru.apache.Sirotin;


/**
 * Created by Администратор on 13.03.14.
 */
class printTreeCommand implements Command {

   printTreeCommand(MyTree tree) {
       this.tree = tree;
   }

    public void execute() {
        tree.printTree();
    }

    private MyTree tree;
}
