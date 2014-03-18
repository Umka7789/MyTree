package ru.apache.Sirotin;

/**
 * TODO: Как я уже говорил, нужно добавить логгирования с использование библиотеки logback и в качестве api к ней - slf4j
 * Раздели классы на пакеты, объедени их логически.
 * Довольно часто интерфейсы помещают отдельно, а их реализации в какой-нибудь пакет impl - этого делается для того,
 * что бы пользователи библиотеки понимали, что это имплементация и на нее нельзя завяываться и использовали интерфейсы
 * вместо конкретных классов, то есть использовали API.
 *
 */
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


		//TODO: read this: http://jlordiales.wordpress.com/2012/12/13/the-builder-pattern-in-practice/
		// and use builder pattern to build menu and menu items
        mainMenu = new Menu();
        mainMenu.addMenuItem(  new MenuItem (new addNodeCommand(newTree), "Add new node.")  );
        mainMenu.addMenuItem(  new MenuItem (new changeNodeParCommand(newTree), "Change node's parent.")  );
        mainMenu.addMenuItem(  new MenuItem (new changeNodeNameCommand(newTree), "Change node's name")  );
        mainMenu.addMenuItem(  new MenuItem (new changeRootNodeCommand(newTree), "Change tree's root node."));
        mainMenu.addMenuItem(  new MenuItem (new deleteNodeCommand(newTree), "Delete node.")  );
        mainMenu.addMenuItem(  new MenuItem (new printTreeCommand(newTree), "Print tree.")  );
        mainMenu.addMenuItem(  new MenuItem (new showHelpCommand(), "Show help.")  );
        mainMenu.addMenuItem(  new MenuItem (new exitCommand(), "Exit.")  );

		//TODO: лучше бы вынести взаимодействие с пользователем в какой-нибудь отдельный класс, который будет
		// печатать меню, читать ввод и запускать команды на исполнение
		// Main пусть отвечает только за запуск и останов.
        printMenu();

        while (programRunning) {
            System.out.print("\nEnter number of the command:");
            int command = readInt();

            mainMenu.callMenu(command);
        }

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

