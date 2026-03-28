import java.util.Scanner;

public class Q10_Check_Vowel {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        char chLowercase = Character.toLowerCase(ch);

        if (chLowercase == 'a' || chLowercase == 'e' || chLowercase == 'i' || chLowercase == 'o' || chLowercase == 'u') {
            System.out.println(ch + " is a vowel");
        } else {
            System.out.println(ch + " is not a vowel");
        }

    }
}
