//Create a calculator using switch (+, -, *, /).

import java.util.Scanner;

public class problem6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner se = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        String ope = se.nextLine();
        int c;

        switch (ope) {
            case "+":
                c = num1 + num2;
                System.out.println(c);
                break;
            case "-":
                c = num1 - num2;
                System.out.println(c);
                break;
            case "*":
                c = num1 * num2;
                System.out.println(c);
                break;
            case "/":
                c = num1 / num2;
                System.out.println(c);
                break;
        
            default:
                System.out.println("give me correct operation");
                break;
        }
    }
}