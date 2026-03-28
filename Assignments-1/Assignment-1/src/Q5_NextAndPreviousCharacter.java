import java.util.Scanner;

public class Q5_NextAndPreviousCharacter {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a character: ");
        char ch = sc.next().charAt(0);
        char ch2 = ch;

        char nextChar = ++ch;
        char PreviousCHar = --ch2;

        System.out.println("Next Character is " + nextChar);
        System.out.println("Previous Character is " + PreviousCHar);


    }
}
