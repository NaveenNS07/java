//Check whether a number is even or odd.
import java.util.*;
public class problem5 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in); 
      int num = sc.nextInt();
      
      if(num%2==0){
        System.out.println("the given number is even");
      }
      else{
        System.out.println("the given number is odd");
      }
    }
}
