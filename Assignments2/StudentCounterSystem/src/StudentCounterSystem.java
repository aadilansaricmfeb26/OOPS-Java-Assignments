class Student {
    String name;
    int rollNo;
    static int totalStudent;

    Student(){

    }

    Student(String name, int rollNo){
        this.name = name;
        this.rollNo = rollNo;
        totalStudent++;
    }

    static void displayTotalStudent() {
        System.out.println("Total Students: " + totalStudent);
    }

}

public class StudentCounterSystem {
    static void main(String[] args) {
        Student s1 = new Student("Aadil", 1);
        Student s2 = new Student("Hina", 2);
        Student s3 = new Student("Rajesh", 3);
        Student s4 = new Student("Ashwin", 4);
        Student s5 = new Student("John", 5);

        Student.displayTotalStudent();

    }
}
