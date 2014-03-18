package ru.apache.Sirotin;

import java.util.ArrayList;


class Menu {

    Menu() {

		//TODO: Если тебе заранее известент размер, то лучше его указать в конструкторе - будет меньше выделений памяти
		// и эта штука будет работать быстрее. А еще за указание этого факта ты получше плюс на собеседовании =).
		// Кстати, почитай заодно, почему ArrayList лучше чем LinkedList и про сложность индексированного доступа и про сложность
		// вставки в ArrayList и LinkedList
        menuItems = new ArrayList<MenuItem>();
    }

    void callMenu (int menuIndex) {

        if(menuIndex < 0  || menuIndex >= menuItems.size() ) {

            System.out.println("Incorrect command number!");
            return;

        }

        menuItems.get(menuIndex).executeCommand();
    }

    void printMenu() {

        System.out.println("\n**********************");
        System.out.println("* Available commands *");
        System.out.println("**********************");

        for(int i = 0; i < menuItems.size(); i++) {
            System.out.println(i + ". " + menuItems.get(i).getName());
        }
    }

    void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }

    private ArrayList<MenuItem> menuItems;
}
