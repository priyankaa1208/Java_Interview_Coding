package Questions;

import java.util.Scanner;

public class Largest_Of_ThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number");
        int num1 = scanner.nextInt();
        System.out.println("Enter the Second Largest");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number");
        int num3 = scanner.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("First number is max: " + num1);
        }
        else if(num2>num3){
            System.out.println("Second number is max : " + num2 );
        }else{
            System.out.println("Third number is max : " + num3);
        }
        scanner.close();
    }
}
