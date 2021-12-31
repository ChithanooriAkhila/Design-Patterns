package prototypedp;

import java.util.Scanner;

public class PrototypeDemo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Employee Id: ");
        int eid=sc.nextInt();
        sc.nextLine();
//        System.out.print("\n");

        System.out.print("Enter Employee Name: ");
        String ename=sc.nextLine();
        sc.nextLine();
//        System.out.print("\n");

        System.out.print("Enter Employee Designation: ");
        String edesignation=sc.nextLine();
//        System.out.print("\n");

        System.out.print("Enter Employee Address: ");
        String eaddress=sc.nextLine();
//        System.out.print("\n");

        System.out.print("Enter Employee Salary: ");
        double esalary= sc.nextDouble();
//        System.out.print("\n");

        EmployeeRecord e1=new EmployeeRecord(eid,ename,edesignation,esalary,eaddress);

        e1.showRecord();
        System.out.println("\n");
        EmployeeRecord e2=(EmployeeRecord) e1.getClone();
        e2.showRecord();
    }
}
