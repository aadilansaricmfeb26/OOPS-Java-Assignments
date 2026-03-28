import java.util.Scanner;

public class Q24_Largest_Digits {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int largest = 0;

        System.out.println("Enter the number: ");
        int digit = sc.nextInt();

        while (digit != 0) {

            int rem = digit % 10;

            largest = Math.max(rem, largest);

            digit = digit / 10;

        }

        System.out.println(largest);

    }
}

/*
We take largest as 0
then we run the while loop until the number is 0
    in loop we store the last digit of the number in rem. digir % 10 gives the last digit
    then we use max() function, it compares the user input number with our largest number 0 and return the largest element
    we store the result in largest var
    we then divide the num by 10
    then we again compare the digits with previous largest values until the digit is zero
 */
