public class Exercise5 {  
  public static void main(String[] args) {
    
    //add code below this line
        //add code below this line

    Item item1 = new Item("milk", 1.5, 1);
    Item item2 = new Item("apple", 0.75, 5);
    Item item3 = new Item("bread", 2.25, 2);
    ShoppingCart cart = new ShoppingCart();

    cart.addItem(item1);
    cart.addItem(item2);
    cart.addItem(item3);

    //add code above this line
    

    //add code above this line
    
  }
}

// for shoppingCart.java
import java.util.*;

class ShoppingCart {
  private ArrayList<Item> items;
  private double total;
  
  public ShoppingCart() {
    items = new ArrayList<Item>();
    total = 0;
  }
  
  public void addItem(Item item) {
    items.add(item);
    calculateTotal();
  }
  
  private void calculateTotal() {
    total = 0;
    for (Item i : items) {
      i.calculateSubtotal();
      total += i.getSubtotal();
    }
  }
  
  public double getTotal() {
    return total;
  }
  
  public int getNumItems() {
    int numItems = 0;
    for (Item i : items) {
      numItems += i.getQuantity();
    }
    return numItems;
  }
  
  public ArrayList<Item> getItems() {
    return items;
  }
  
  public String toString() {
    return getClass().getName() + "[items=" + items + ", total=" + total + "]";
  }
}

//for file item.java

class Item {
  private String name;
  private double price;
  private int quantity;
  private double subtotal;
  
  public Item(String n, double p, int q) {
    name = n;
    price = p;
    quantity = q;
    subtotal = 0;
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public void calculateSubtotal() {
    subtotal = price * quantity;
  }
  
  public double getSubtotal() {
    return subtotal;
  }
  
  public String toString() {
    return getClass().getName() + "[name=" + name + ", price=" + price + ", quantity=" + quantity + ", subtotal=" + subtotal + "]";
  }
}
