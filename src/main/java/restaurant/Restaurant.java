package restaurant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
public class Restaurant {
    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Chips & Dip", "Best thing to munch and crunch", "Appetizer", 7.99, new Date(2022, 01, 01));
        MenuItem item2 = new MenuItem("Fried Pickles", "Green and Fried, like a Ninja Turtle", "Appetizer", 5.99, new Date (2023, 02, 01));
        MenuItem item3 = new MenuItem("Cheeseburger", "Quarter Pound of Happiness", "Main Course", 9.99, new Date (2022, 01, 01));
        MenuItem item4 = new MenuItem("Steak", "Can't Moo Anymore", "Main Course", 14.99, new Date (2023,02,01));
        MenuItem item5 = new MenuItem("Chicken Tenders", "Cluckin' Good", "Main Course", 8.99, new Date (2022, 07, 01));
        MenuItem item6 = new MenuItem("Caesar Salad", "For the Animal Lovers", "Main Course", 9.99, new Date (2022, 01, 01));
        MenuItem item7 = new MenuItem("Brownies", "Not those kind of Brownies", "Dessert", 4.99, new Date (2022, 01, 01));
        MenuItem item8 = new MenuItem("Cake", "Even if it's not your birthday", "Dessert", 5.99, new Date (2023, 02, 01));
        ArrayList<MenuItem> myMenu = new ArrayList<>(Arrays.asList(item1, item2, item3, item4, item5, item6, item7, item8));

        Menu firstMenu = new Menu("Mike's Bistro", myMenu);
        System.out.println(firstMenu.toString());
        System.out.println(item1.toString());
        firstMenu.removeMenuItem("Chicken Tenders");
        System.out.println(firstMenu.toString());
    }
}