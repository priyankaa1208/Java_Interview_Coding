package Questions;

import java.util.Scanner;

public class Smallest_Of_ThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1  = scanner.nextInt();
        System.out.println("enter the second number");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number");
        int num3 = scanner.nextInt();
        if(num1<num2 && num1<num3){
            System.out.println("First number is min : " + num1);
        }else if(num2<num3){
            System.out.println("Second number is min : " + num2);
        }else{
            System.out.println("Third number is min : " + num3);
        }
        scanner.close();
    }
}
