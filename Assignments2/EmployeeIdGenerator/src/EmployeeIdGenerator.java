class Employee {
    String empName;
    int empId;
    static int id;

    Employee(){

    }

    Employee(String empName){
        this.empName = empName;
        id++;
        this.empId = id;
    }

    void printDetails(){
        System.out.println("Employee Name: " + empName);
        System.out.println("Employee Id: " + empId);
    }

}

public class EmployeeIdGenerator {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Aadil");
        Employee emp2 = new Employee("Hina");
        Employee emp3 = new Employee("Sharul");
        Employee emp4 = new Employee("John");

        emp1.printDetails();
        emp2.printDetails();
        emp3.printDetails();
        emp4.printDetails();

    }
}
