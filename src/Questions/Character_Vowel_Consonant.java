package Questions;

import java.util.Scanner;

public class Character_Vowel_Consonant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //Check if a Character is a Vowel or Consonant.
        System.out.println("Enter a Character is a Vowel or Consonant");
        char ch = scanner.next().charAt(0);
        ch = Character.toLowerCase(ch);
        if(!Character.isLetter(ch)){
            System.out.println("this is a letter");
        }else{
            if(ch== 'a'|| ch == 'e' || ch == 'i' || ch =='o' || ch =='u'){
                System.out.println("this is vowel");
            }
            else{
                System.out.println("this is a constant");
            }
            scanner.close();
        }
    }
}
