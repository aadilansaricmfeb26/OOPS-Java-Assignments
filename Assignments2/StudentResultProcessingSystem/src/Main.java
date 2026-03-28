import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter student name: ");
        String studentName = sc.nextLine();

        System.out.println("Enter Roll no: ");
        int rollNo = sc.nextInt();

        System.out.println("How many Subjects?");
        int subCounts = sc.nextInt();

        double [] marks = new double[subCounts];

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Enter Subject " + (i + 1) + " Mark: ");
            double ele = sc.nextDouble();
            marks[i] = ele;
        }

    Student s = new Student(studentName, rollNo, marks);
    s.displayInfo();

    }
}