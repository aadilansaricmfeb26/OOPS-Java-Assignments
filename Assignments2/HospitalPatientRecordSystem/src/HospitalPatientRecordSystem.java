class Patient {
    int patientID;
    String patientName;
    short age;
    String disease;

    Patient(){

    }

    Patient(int patientID, String patientName, short age, String disease){
        this.patientID = patientID;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    void displayDetails(){
        System.out.println("Patient ID: " + patientID);
        System.out.println("Patient Name: " + patientName);
        System.out.println("Age: " + age);
        System.out.println("Disease: " + disease);
    }

    void checkSeniorCitizen(){
        if (age > 60) {
            System.out.println(patientName + " is a senior citizen");
        } else {
            System.out.println(patientName + " is not a senior citizen");
        }
    }


}

public class HospitalPatientRecordSystem {
    public static void main(String[] args) {
        Patient p1 = new Patient(1, "Aadil", (short)25, "Autism");
        Patient p2 = new Patient(2, "Test 2", (short)52, "Fever");
        Patient p3 = new Patient(3, "Test 3", (short)61, "Cold");
        Patient p4 = new Patient(4, "Test 4", (short)18, "Cough");

        p1.displayDetails();
        p1.checkSeniorCitizen();
        System.out.println();

        p2.displayDetails();
        p2.checkSeniorCitizen();
        System.out.println();

        p3.displayDetails();
        p3.checkSeniorCitizen();
        System.out.println();

        p4.displayDetails();
        p4.checkSeniorCitizen();
        System.out.println();


    }
}
