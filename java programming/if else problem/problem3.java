//Find the largest of two numbers.

import java.util.Scanner;

public class problem3 {
    public static void main(String[] args) {
        Scanner na = new Scanner(System.in);
        int a = na.nextInt();
        int b = na.nextInt();

        if(a<b){
            System.out.println("B is largest number");
        }
        else if(a==b){
            System.out.println("A and B are equal");
        }
        else{
            System.out.println("A is Largest number");
        }
    }
}
