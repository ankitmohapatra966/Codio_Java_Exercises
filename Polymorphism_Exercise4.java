import java.util.Arrays;

//add class definitions below this line

class Median {
  public double calculateMedian(int n1, int n2) {
    return (double) (n1 + n2) / 2;
  }
  
  public double calculateMedian(int n1, int n2, int n3) {
    int[] nums = {n1, n2, n3};
    Arrays.sort(nums);
    return (double) nums[1];
  }
  
  public double calculateMedian(int n1, int n2, int n3, int n4) {
    int[] nums = {n1, n2, n3, n4};
    Arrays.sort(nums);
    return (double) (nums[1] + nums[2]) / 2;
  }
  
  public double calculateMedian(int n1, int n2, int n3, int n4, int n5) {
    int[] nums = {n1, n2, n3, n4, n5};
    Arrays.sort(nums);
    return (double) nums[2];
  }
}

//add class definitions above this line

public class Exercise4 {  
  public static void main(String[] args) {
    
    //add code below this line

    Median m = new Median();
    System.out.println(m.calculateMedian(3, 5, 1, 4, 2));
    System.out.println(m.calculateMedian(8, 6, 4, 2));
    System.out.println(m.calculateMedian(9, 3, 7));
    System.out.println(m.calculateMedian(5, 2));
    
    //add code above this line
  }
}
