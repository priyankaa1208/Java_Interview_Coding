package Questions;

import java.util.Scanner;

public class Grade_Marks_calculate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers between 0 to 100");
        int num = scanner.nextInt();
        if (num<0 || num>100){
            System.out.println("Entered number is not between 0 to 100, Please entre valid number!");
        }else if(num >=90 && num<=100){
            System.out.println("You got a grade ; A++");
        } else if (num>= 80 && num<= 89) {
            System.out.println("you got a Grade : A ");
        }else if(num>=70 && num<=79){
            System.out.println("you got a Grade : B");
        }else if(num>= 60 && num<= 69){
            System.out.println("you got a Grade : C ");
        }else if(num >= 50 && num<=59){
            System.out.println("you goy a Grade : D");
        }else if(num>=40 && num<= 49){
            System.out.println("you got a Grade : E");
        }else {
            System.out.println("you are fail");
        }
        scanner.close();
    }
}
