import java.util.Scanner;

public class Employee34{
    public static void main(String[] args) {
       Employee_detail e1 = new Employee_detail();
       e1.printDetails(); 
    }
}
class Employee_detail {
    int Emplyee_ID;
    String Name;
    String Designation;
    double Salary;
     
    Employee_detail(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter employee id: ");
        this.Emplyee_ID = sc.nextInt();
        System.out.print("Enter employee name: ");
        this.Name = sc.next();
        System.out.print("Enter employee designation: ");
        this.Designation = sc.next();
        System.out.print("Enter employee salary: ");
        this.Salary = sc.nextDouble();
    }
    
    public void printDetails(){

        System.out.println("-----Employee_details-----");

        System.out.println("Employee id: " + this.Emplyee_ID);
        System.out.println("Employee name: " + this.Name);
        System.out.println("Employee designation: " + this.Designation);
        System.out.println("Employee salary: " + this.Salary);
    }
}
