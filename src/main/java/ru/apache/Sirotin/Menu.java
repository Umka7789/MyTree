package ru.apache.Sirotin;

import java.util.ArrayList;


class Menu {

    private ArrayList<MenuItem> menuItems;

    Menu() {

        menuItems = new ArrayList<MenuItem>(8);
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

}
