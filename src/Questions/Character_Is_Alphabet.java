package Questions;

import java.util.Scanner;

public class Character_Is_Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the character to check it is alphabet");
        char ch = scanner.next().charAt(0);
        if(Character.isAlphabetic(ch)){
            System.out.println("This is an Alphabet");
        }else{
            System.out.println("This is not alphabet");
        }
        scanner.close();
    }
}
