//Check whether a person can vote.
import java.util.Scanner;

public class problem2 {
    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);
        int age = na.nextInt();

        if (0<age && age<18) {
            System.out.println("the person cannot vote");
        }
        else if(age>18){
            System.out.println("the person can vote");
        }
        else{
            System.out.println("give correct age");
        }
    }
}
