package ru.apache.Sirotin;

import ru.apache.Sirotin.commands.*;

public class Director {

    public Menu buildMenu(MenuBuilder builder, MyTree newTree) {
        builder.createMenu();
        builder.addMenuItem(new AddNodeCommand(newTree), "Add new node.");
        builder.addMenuItem(new ChangeNodeParCommand(newTree), "Change node's parent.");
        builder.addMenuItem(new ChangeNodeNameCommand(newTree), "Change node's name");
        builder.addMenuItem(new ChangeRootNodeCommand(newTree), "Change tree's root node.");
        builder.addMenuItem(new DeleteNodeCommand(newTree), "Delete node.");
        builder.addMenuItem(new PrintTreeCommand(newTree), "Print tree.");
        builder.addMenuItem(new ShowHelpCommand(), "Show help.");
        builder.addMenuItem(new ExitCommand(), "Exit.");
        return builder.getMenu();
    }
}
