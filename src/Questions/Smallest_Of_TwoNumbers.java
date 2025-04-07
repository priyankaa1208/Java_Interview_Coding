package Questions;

import java.util.Scanner;

public class Smallest_Of_TwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second number");
        int num2 = scanner.nextInt();
        if(num1<num2){
            System.out.println("First number is min : " + num1);
        }else{
            System.out.println("Second number is min :" + num2);
        }
        scanner.close();
    }
}
