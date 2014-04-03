package ru.apache.Sirotin;

import ru.apache.Sirotin.commands.*;
import ru.apache.Sirotin.treeVisitors.PrintTreeVisitor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Раздели классы на пакеты, объедени их логически.
 * Довольно часто интерфейсы помещают отдельно, а их реализации в какой-нибудь пакет impl - этого делается для того,
 * что бы пользователи библиотеки понимали, что это имплементация и на нее нельзя завяываться и использовали интерфейсы
 * вместо конкретных классов, то есть использовали API.
 *
 */
public class Main {

    private static boolean programRunning = true;
    private static Menu mainMenu;
    static public final Logger LOG = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {


        MyTree newTree = new MyTree("RootNode");
        newTree.addNode(0,"Child1");
        newTree.addNode(0,"Child2");
        newTree.addNode(0,"Child3");
        newTree.addNode(2,"Child2-1");

        newTree.accept(new PrintTreeVisitor());

        mainMenu = new Director().buildMenu(new MenuBuilder(), newTree);

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

    public static void printMenu() {
        mainMenu.printMenu();
    }

    public static void exitProgram() {
        programRunning = false;
    }
    public static int readInt() {

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

    public static String readString() {

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

