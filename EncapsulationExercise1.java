//add class definitions below this line

class Fruit {
  private String name;
  private String color;
  
  public Fruit(String n, String c) {
    name = n;
    color = c;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String newName) {
    name = newName;
  }
  
  public String getColor() {
    return color;
  }
  
  public void setColor(String newColor) {
    color = newColor;
  }
}
  
//add class definitions above this line

public class CodingExercise1 {
  public static void main(String[] args) {
    
    //add code below this line

    Fruit myFruit = new Fruit("strawberry", "red");
    
    System.out.println(myFruit.getName());
    System.out.println(myFruit.getColor());
    
    myFruit.setName("tangerine");
    myFruit.setColor("orange");
    System.out.println(myFruit.getName());
    System.out.println(myFruit.getColor());

    //add code above this line
  }
}
