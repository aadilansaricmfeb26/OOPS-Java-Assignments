import java.util.Scanner;

public class Q27_Marks {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter English Marks: ");
        double english = sc.nextDouble();

        System.out.println("Enter Maths Marks: ");
        double maths = sc.nextDouble();

        System.out.println("Enter Science Marks: ");
        double science = sc.nextDouble();

        System.out.println("Enter History Marks: ");
        double history = sc.nextDouble();

        System.out.println("Enter SST Marks: ");
        double sst = sc.nextDouble();

        double total = english+maths+science+history+sst;
        double per = (total / 500) * 100;
        char grade;
        
        if(per >= 90){
            grade = 'A';
        } else if (per <90 && per >= 70) {
            grade = 'B';
        } else if (per < 70 && per >=60) {
            grade = 'C';
        } else {
            grade = 'F';
        }

        System.out.println("Total Marks: " + total + "\nPercentage: " + per + "\nGrade: " + grade);

    }

}
