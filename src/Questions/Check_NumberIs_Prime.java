package Questions;

import java.util.Scanner;

public class Check_NumberIs_Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number if it is prime");
        int num = scanner.nextInt();
        boolean isPrime = true;
        if(num<=1){
            isPrime = false;
        }else{
            for(int i =2 ;i<=Math.sqrt(num); i++){
                if(num %1==0){
                    isPrime = false;
                    break;
                }
            }

        }
        if(isPrime){
            System.out.println(num + " is a prime number ");
        }else {
            System.out.println(num + " is not a prime number");
        }
        scanner.close();
    }
}
