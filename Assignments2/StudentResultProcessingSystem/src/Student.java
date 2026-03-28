public class Student {
    String studentName;
    int rollNumber;
    double [] marks;
    double total;
    double percentage;
    double avg;
    char grade;
    boolean isPromoted;

    Student(String studentName, int rollNumber, double [] marks) {
        this.studentName = studentName;
        this.rollNumber = rollNumber;
        this.marks = marks;
        calculateAll();
    }

    void calculateTotal(){
        double sum = 0.0;
        for(double mark : marks) {
            sum += mark;
        }
        this.total = sum;
    }

    void calculateAvg() {
        int count = marks.length;
        this.avg = total / count;
    }

    void calculatePercentage(){
        double totalMarks = marks.length * 100;
        this.percentage = total / totalMarks * 100;
    }

    void calculateGrade(){
       if (percentage > 90) {
           this.grade = 'A';
       } else if (percentage > 75 && percentage < 89) {
           this.grade = 'B';
        } else if (percentage > 60 && percentage < 74) {
           this.grade = 'C';
       } else if (percentage > 40 && percentage < 59) {
           this.grade = 'D';
       } else {
           this.grade = 'F';
       }
    }

   void calculateAll() {
        calculateTotal();
        calculateAvg();
        calculatePercentage();
        calculateGrade();
        isPromote();
   }

   void isPromote(){
       this.isPromoted = grade != 'F';
   }

   void displayInfo(){
       System.out.println("Student Name: " + studentName);
       System.out.println("\nRoll Number: " + rollNumber);
       System.out.println("Total Marks: " + total);
       System.out.println("Average Marks: " + avg);
       System.out.println("Total Percentage: " + percentage);
       System.out.println("Grade: " + grade);
       System.out.println("Promoted to the next class: " + (isPromoted ? "Yes" : "No") );
   }

}
