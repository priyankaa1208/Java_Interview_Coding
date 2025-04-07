package Questions;

import java.util.Scanner;

public class Check_LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year to check it is leap year");
        int year = scanner.nextInt();
    if(year >=0){
        System.out.println("This is not a correct year");
    }else if(year%4 ==0){
        System.out.println("this is a leap year");
    }else{
        System.out.println("This is not leap year");
    }
scanner.close();

    }
}
