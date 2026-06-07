//Check whether a character is a vowel or consonant using switch.

import java.util.Scanner;

public class problem7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);

        switch (c) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("the given char is vowels");
                break;
        
            default:
                System.out.println("the given char is consonant");
                break;
        }
    }
}
