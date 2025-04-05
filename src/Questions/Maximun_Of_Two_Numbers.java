package Questions;

import java.util.Scanner;

public class Maximun_Of_Two_Numbers {
    public static void main(String[] args) {
        Scanner scan =new Scanner (System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
     int max;
     if(num1>num2){
        max= num1;
     }else{
      max =num2;
     }
        System.out.println("the maximum number is "  + max);
     scan.close();
    }
}
