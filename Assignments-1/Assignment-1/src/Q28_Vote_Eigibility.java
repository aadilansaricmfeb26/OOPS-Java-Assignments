import java.util.Scanner;

public class Q28_Vote_Eigibility {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if(age > 130) {
            System.out.println("Sorry, ghost can't vote :)");
        } else if(age >= 18) {
            System.out.println("Congrats! you are eligible for voting");
        } else if(age <= 0) {
            System.out.println("You need to born first to vote");
        }
        else {
            System.out.println("Sorry, you are not eligible for voting");
        }

    }
}
