package restaurant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList updated;
    private ArrayList menuItems;
    private ArrayList newMenuItems;

    public Menu(ArrayList updated, ArrayList menuItems, ArrayList newMenuItems) {
        this.updated = updated;
        this.menuItems = menuItems;
        this.newMenuItems = newMenuItems;
    }

    public void setUpdated(ArrayList updated) {this.updated=updated;}
    public void setMenuItems(ArrayList menuItems) {this.menuItems=menuItems;}
    public void setNewMenuItems(ArrayList newMenuItems) {this.newMenuItems=newMenuItems;}

    public ArrayList getupdated() { return updated; }
    public ArrayList getmenuItems() { return menuItems; }
    public ArrayList getNewMenuItems() { return newMenuItems; }

}
