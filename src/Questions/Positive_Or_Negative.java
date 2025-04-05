package Questions;

import java.util.Scanner;

public class Positive_Or_Negative {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
int num =scan.nextInt();

        if (num>0){
            System.out.println("The number is positive");
        }else if(num<0){
            System.out.println("the number is negative");
        }else {
            System.out.println("the number is Zero");
        }
scan.close();
    }
}
