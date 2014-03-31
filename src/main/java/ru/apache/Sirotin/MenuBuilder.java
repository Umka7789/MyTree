package ru.apache.Sirotin;

public class MenuBuilder {

    private Menu menu;

    public void createMenu( ) {
        menu = new Menu();
    }

    public Menu getMenu() {
        return menu;
    }

    public void addMenuItem(Command command, String menuItemName) {
        MenuItem item = new MenuItem(command, menuItemName);
        menu.addMenuItem(item);
    }

}
