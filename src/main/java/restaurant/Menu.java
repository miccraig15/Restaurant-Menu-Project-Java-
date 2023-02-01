package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private String restaurantName;
    private ArrayList<MenuItem> menuItems = new ArrayList<MenuItem>();

    public Menu(String restaurantName, ArrayList<MenuItem> menuItems) {
        this.restaurantName = restaurantName;
        this.menuItems = menuItems;
    }

    public void setRestaurantName (String restaurantName) {this.restaurantName=restaurantName;}
    public void setMenuItems(ArrayList<MenuItem> menuItems) {this.menuItems=menuItems;}

    public String getRestaurantName() { return restaurantName; }
    public ArrayList<MenuItem> getMenuItems() { return menuItems; }

    public void addMenuItem(MenuItem menuItem) {
        if (!menuItems.contains(menuItem)) {menuItems.add(menuItem);}
    }
    public void removeMenuItem(String menuItemName) {
        for (MenuItem item : menuItems) {
            if (item.getName().equals(menuItemName)) {
                menuItems.remove(item);
            }
        }
    }
    @Override
    public String toString() {
        Date day = new Date(2023,01,24);
        String allItems = "";

        for (MenuItem item : menuItems) {
            allItems += "\n\n\t\t\t" + item.isNew(day) + "\n\tName: " + item.getName() +
                    "\n\tDescription: " + item.getDescription() +
                    "\n\tCategory: " + item.getCategory() +
                    "\n\tPrice: " + item.getPrice();
        }
        return "Menu\n\n" +
                "Restaurant Name: " + restaurantName +
                "\n\nFood: " + allItems;
    }
}
