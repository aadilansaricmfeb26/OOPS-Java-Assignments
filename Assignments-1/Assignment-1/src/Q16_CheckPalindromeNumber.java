import java.util.Scanner;

public class Q16_CheckPalindromeNumber {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = sc.nextInt();

        int originalNumber = number;
        int reverseNum = 0;
        int rem = 0;

        while(number > 0) {
            rem = number % 10;
            reverseNum = reverseNum * 10 + rem;
            number = number / 10;
        }

        if (originalNumber == reverseNum)
            System.out.println(originalNumber + " is a palindrome number");
        else
            System.out.println(originalNumber + " is not a palindrome number");
    }
}
