/*Find grade based on marks:
90+ → A
80+ → B
70+ → C
Below 70 → Fail */
import java.util.*;
public class problem8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num>=90 && num<=100){
            System.out.print("A grade");
        }
        else if(num>=80 && num<90){
            System.out.print("B grade");
        }
        else if(num>=70 && num<80){
            System.out.print("C grade");
        }
        else if(num>=0 && num<70){
            System.out.print("Fail");
        }
        else{
            System.out.print("Give correct input");
        }
    }
    
}
