package Questions;

import java.util.Scanner;

public class Even_Or_Odd {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("Enter the number to check it is positive or negative");
        int num = scan.nextInt();
        if(num%2==0){
            System.out.println("It is even number");
        }else{
            System.out.println("it is odd number");
        }
        scan.close();
    }
}
