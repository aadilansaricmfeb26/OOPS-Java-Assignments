class Employee{
    String empName;
    int empId;
    double baseSalary;

    Employee(String empName, int empId, double baseSalary){
        this.empName = empName;
        this.empId = empId;
        this.baseSalary = baseSalary;
    }

}

class EmployeeSalarySlip extends Employee{
    double hra;
    double da;
    double pf;
    double netSalary;

    EmployeeSalarySlip(String empName, int empId, double baseSalary){
        super(empName, empId, baseSalary);
    }

    void calculateHra(){
        this.hra = baseSalary * 0.2;
    }

    void calculateDa(){
        this.da = baseSalary * 0.1;
    }

    void calculatePf(){
        this.pf = baseSalary * 0.08;
    }


    void calculateNetSalary() {
        calculateHra();
        calculateDa();
        calculatePf();
        netSalary = baseSalary + hra + da + pf;
    }

    void printSalarySlip(){
        calculateNetSalary();
        System.out.println("Base Salary: " + this.baseSalary);
        System.out.println("HRA: " + this.hra);
        System.out.println("DA: " + this.da);
        System.out.println("PF: " + this.pf);
        System.out.println("Net Salary: " + this.netSalary);
    }

}


public class EmployeeSalarySlipGenerator {
    static void main(String[] args) {
        EmployeeSalarySlip aadil = new EmployeeSalarySlip("Aadil Ansari", 1, 20000);

        aadil.printSalarySlip();

    }
}