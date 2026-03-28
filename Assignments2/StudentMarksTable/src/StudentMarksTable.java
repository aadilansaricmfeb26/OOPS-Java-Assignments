import java.util.Scanner;

public class StudentMarksTable {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] marks = new int[3][3];
        int [] totalPerStudent = new int[3];
        int sum = 0;
        double avg = 0.0;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Student " + (i+1));
            for (int j = 0; j < marks[i].length; j++) {
                System.out.println("Enter Subject " + (j+1) + " Mark: ");
                int mark = sc.nextInt();
                marks[i][j] = mark;
                sum += marks[i][j];
            }
        }

        avg = (double)sum/marks.length;

        for (int i = 0; i < marks.length; i++) {
            int sumPerStu = 0;
//            System.out.println("Enter Student " + (i+1) + " Marks");
            System.out.print("Student " + (i+1) + ": ");
            for (int j = 0; j < marks[i].length; j++) {
                System.out.print(marks[i][j] + " ");
                sumPerStu += marks[i][j];
            }
            totalPerStudent[i] = sumPerStu;
            System.out.println();
        }
        for (int totalPerStud : totalPerStudent) {
            System.out.println("Total Per Student: " + totalPerStud);
        }
        System.out.println("Total marks of all student: " + sum);
        System.out.println("Average of all student: " + avg);

    }
}
