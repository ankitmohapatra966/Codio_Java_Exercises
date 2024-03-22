import java.util.*;

class Band {
  private String name;
  private String genre;
  private String[] members;
  
  public Band(String n, String g, String[]m) {
    name = n;
    genre = g;
    members = m;
  }
  
  //add class definitions below this line
  
  public String toString() {
    String nameAttribute = "name=" + name + ", ";
    String genreAttribute = "genre=" + genre + ", ";
    String membersAttribute = "members=" + Arrays.toString(members);
    return getClass().getName() + "[" + nameAttribute + genreAttribute + membersAttribute + "]";
  }

  //add method definition above this line
}

public class Exercise2 {  
  public static void main(String[] args) {
    
    //add code below this line
    
    String[] members = {"Jerry", "Bob", "Mickey", "Bill", "Phil", "Pigpen"};
    Band dead = new Band("The Grateful Dead", "rock'n roll", members);
    System.out.println(dead);

    //add code above this line
    
  }
}
