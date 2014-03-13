package ru.apache.maven;


public class Main {

    private static boolean programRunning = true;
    private static Menu mainMenu;

    public static void main(String[] args) {


        MyTree newTree = new MyTree("RootNode");
        newTree.addNode(0,"Child1");
        newTree.addNode(0,"Child2");
        newTree.addNode(0,"Child3");
        newTree.addNode(2,"Child2-1");

        newTree.printTree();


        mainMenu = new Menu();
        mainMenu.addMenuItem(  new MenuItem (new addNodeCommand(newTree), "Add new node.")  );
        mainMenu.addMenuItem(  new MenuItem (new changeNodeParCommand(newTree), "Change node's parent.")  );
        mainMenu.addMenuItem(  new MenuItem (new changeNodeNameCommand(newTree), "Change node's name")  );
        mainMenu.addMenuItem(  new MenuItem (new changeRootNodeCommand(newTree), "Change tree's root node."));
        mainMenu.addMenuItem(  new MenuItem (new deleteNodeCommand(newTree), "Delete node.")  );
        mainMenu.addMenuItem(  new MenuItem (new printTreeCommand(newTree), "Print tree.")  );
        mainMenu.addMenuItem(  new MenuItem (new showHelpCommand(), "Show help.")  );
        mainMenu.addMenuItem(  new MenuItem (new exitCommand(), "Exit.")  );




        printMenu();



        while (programRunning) {
            System.out.print("\nEnter number of the command:");
            int command = readInt();

            mainMenu.callMenu(command);


        }
//      while(true) {
//
//          System.out.print("\nEnter number of the command:");
//          int command = readInt();
//
//          if(command == 8)
//              break;
//
//
//          switch (command) {
//
//                case 1:
//                    addNode.execute();
//                    break;
//
//                case 2:
//                    changeNodeParent.execute();
//                    break;
//
//                case 3:
//                    changeNodeName.execute();
//                    break;
//                case 4: break;
//
//                case 5:
//                    deleteNode.execute();
//                    break;
//                case 6:
//                    printTree.execute();
//                    break;
//                case 7:
//                    printHelp();
//                    break;
//
//                default: System.out.println("Incorrect command number!");
//
//            }
//
//
//
//       }



    }

    static void printMenu() {
        mainMenu.printMenu();
    }

    static void exitProgram() {
        programRunning = false;
    }
    static int readInt() {

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

    static String readString() {

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


}

