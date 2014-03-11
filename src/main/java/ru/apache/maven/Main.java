package ru.apache.maven;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        MyTree newTree = new MyTree("RootNode");
        newTree.addNode(0,"Child1");
        newTree.addNode(0,"Child2");
        newTree.addNode(0,"Child3");
        newTree.addNode(2,"Child2-1");

        newTree.printTree();
        printCommands();


      boolean running = true;

      while(running) {
            System.out.println();
            System.out.print("Enter number of the command:");
            int command = readInt();


            int parentId, childId, id;
            String name;

            switch (command) {

                case 1:
                    System.out.println("Enter parent node id (number before name)");
                    parentId = readInt();
                    System.out.println("Enter node name");
                    name = readString();

                    if (newTree.addNode(parentId, name) == false)
                        System.out.println("There is no node with number " + parentId);
                    break;

                case 2:
                    System.out.println("Enter new parent node id (number before name)");
                    parentId = readInt();
                    System.out.println("Enter child node id (number before name)");
                    childId = readInt();

                    if( newTree.changeParent(parentId, childId) == false)
                        System.out.println("You entered incorrect ids");
                    break;
                case 3:
                    System.out.println("Enter  node's id (number before name)");
                    id = readInt();
                    System.out.println("Enter new name");
                    name = readString();
                    if (newTree.changeNodeName(name, id) == false)
                        System.out.println("There is no node with number " + id);
                    break;
                case 4: break;

                case 5:
                    System.out.println("Enter  node's id (number before name)");
                    id = readInt();
                    if (newTree.deleteNode(id) == false)
                        System.out.println("There is no node with number " + id);
                    break;
                case 6:
                    newTree.printTree();
                    break;
                case 7:
                    printHelp();
                    break;
                case 8:
                    running = false;
                    break;

                default: System.out.println("Incorrect command number!");

            }



       }



    }


    private static void printHelp() {
        System.out.println("** Just do it =D **");
        printCommands();
    }


    private static int readInt() {

        java.io.BufferedReader jin =
                new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int buf;

        try {
            buf = Integer.parseInt(jin.readLine());
        }

        catch (java.io.IOException e) {
            buf = -1;
        }

        catch(NumberFormatException e) {
            System.out.println("Incorrect data! Try again!");
            buf = readInt();
        }
        return buf;
    }

    private static String readString() {

        java.io.BufferedReader jin =
                new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        String buf;

        try {
            buf = jin.readLine();
        }

        catch (java.io.IOException e) {
            buf = "null";
        }

        return buf;


    }
    private static void printCommands() {
        System.out.println("");
        System.out.println("**********************");
        System.out.println("* Available commands *");
        System.out.println("**********************");
        System.out.println("1. Add new node.");
        System.out.println("2. Change node's parent.");
        System.out.println("3. Change node's name.");
        System.out.println("4. Change tree's root node.");
        System.out.println("5. Delete node.");
        System.out.println("6. Print tree.");
        System.out.println("7. Help.");
        System.out.println("8. Exit.");
        System.out.println("");
    }
}

