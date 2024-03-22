abstract class Vehicle {
  public abstract double travel(double time);
}

//add class definitions below this line

class Airplane extends Vehicle {
  private double speed;
  
  public Airplane(double s) {
    speed = s;
  }
  
  public double travel(double time) {
    return speed * time;
  }
}

//add class definitions above this line

public class Exercise2 {  
  public static void main(String[] args) {
    
    //add code below this line

    Airplane a = new Airplane(550.0);
    System.out.println(a.travel(2));
    System.out.println(a.travel(3.15));
    System.out.println(a.travel(10.63));
    
    //add code above this line
  }
}
