package Questions;

import java.util.Scanner;

public class Person_Eligible_For_Vote {
    public static void main(String[] args) { //Check if a Person is Eligible to Vote (Age Check)
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the age");
        int age =scanner.nextInt();
        if(age>=18){
            System.out.println("your are major and  eligible to vote");
        }else{
            System.out.println("your are minor and not eligible to vote");
        }
        scanner.close();


    }
}
