import java.util.Scanner;
class positiveORnegative{
    public static void main(String[] args){
        Scanner po = new Scanner(System.in);
        int num = po.nextInt();
        
        if(0<=num){
            System.out.println("The given number is postive");
        }
        else{
            System.out.println("the given number is negative");
        }
    }
}    
