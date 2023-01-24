package restaurant;

public class MenuItem {
    private String name;
    private String description;
    private String category;
    private double price;


    public MenuItem(String name, String description, String category, double price) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.price = price;
    }

    public void setName(String name) {this.name=name;}
    public void setDescription(String description) {this.description=description;}
    public void setCategory(String category) {this.category=category;}
    public void setPrice(double price) {this.price=price;}

    public String getName() { return name; }
    public String getDescription() { return description; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }


}
