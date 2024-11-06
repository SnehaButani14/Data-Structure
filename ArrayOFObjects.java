import java.util.Scanner;

public class ArrayOFObjects {
    public static void main(String[] args) {
        Student_detail[] student = new Student_detail[5];
        for (int i = 0; i < 5; i++) {
            student[i] = new Student_detail();
            
        }
        
       
        for (Student_detail s : student) {
            s.printDetails();
        }
    }
}

class Student_detail {
    String Enrollment_No;
    String Name;
    int Semester;
    int CPI;

    Student_detail() {
        for(int i=0;i<5;i++){
        System.out.println("----Enter details of student" + (i+1) +  "----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        this.Name = sc.next();
        System.out.print("Enter Enrollment No: ");
        this.Enrollment_No = sc.next();
        System.out.print("Enter Semester of student: ");
        this.Semester = sc.nextInt();
        System.out.print("Enter CPI of student: ");
        this.CPI = sc.nextInt();
        }
    }

    public void printDetails() {
        for(int i=0;i<5;i++){
        System.out.println("Name: " + this.Name);
        System.out.println("Enrollment No: " + this.Enrollment_No);
        System.out.println("Semester: " + this.Semester);
        System.out.println("CPI: " + this.CPI);
        }
    }
}
