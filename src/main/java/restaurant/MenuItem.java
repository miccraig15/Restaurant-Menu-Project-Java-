package restaurant;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private int id;
    private static int nextId=1;
    private String name;
    private String description;
    private String category;
    private double price;
    private Date dayAdded;

    public MenuItem() {
        this.id = nextId;
        nextId++;
    }

    public MenuItem(String name, String description, String category, double price, Date dayAdded) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
        this.dayAdded = dayAdded;
    }

    public void setName(String name) {this.name=name;}
    public void setDescription(String description) {this.description=description;}
    public void setCategory(String category) {this.category=category;}
    public void setPrice(double price) {this.price=price;}
    public void setDayAdded(Date dayAdded) {this.dayAdded=dayAdded;}

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public Date getDayAdded() { return dayAdded; }

    public String isNew(Date today) {
        if (today.getMonth() - this.dayAdded.getMonth() >= 0) {
            return "NEW";
        }
        return "";
    }

    @Override
    public String toString() {
        return "\nMenuItem\n" +
                "\nName: " + name +
                "\nDescription: " + description +
                "\nCategory: " + category +
                "\nPrice: " + price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MenuItem menuItem = (MenuItem) o;
        return CharSequence.compare(menuItem.category, category) == 0 && Double.compare(menuItem.price, price) == 0 && Objects.equals(name, menuItem.name) && Objects.equals(description, menuItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, description, category, price);
    }
}
