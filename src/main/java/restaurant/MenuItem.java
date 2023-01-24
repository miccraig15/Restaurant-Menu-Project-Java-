package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;
    private ArrayList Date;


    public MenuItem(String name, String description, String category, double price, ArrayList Date) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.Date = Date;
    }

    public void setName(String name) {this.name=name;}
    public void setDescription(String description) {this.description=description;}
    public void setCategory(String category) {this.category=category;}
    public void setPrice(double price) {this.price=price;}
    public void setDate(ArrayList Date) {this.Date=Date;}

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public ArrayList getDate() { return Date; }

}
