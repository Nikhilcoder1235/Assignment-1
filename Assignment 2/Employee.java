package Second;

import java.util.Scanner;

class Emp {
    int empId;
    String name;
    double salary;

    void acceptData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        empId = sc.nextInt();

        sc.nextLine(); 

        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();

        System.out.print("Enter Salary: ");
        salary = sc.nextDouble();
    }

    void displayData() {
        System.out.println("\nEmployee Details");
        System.out.println("ID : " + empId);
        System.out.println("Name : " + name);
        System.out.println("Salary : " + salary);
    }
}

public class Employee {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Emp emp = new Emp();

        int choice;

        do {
            System.out.println("\n===== Employee Menu =====");
            System.out.println("1. Accept Employee Data");
            System.out.println("2. Display Employee Data");
            System.out.println("3. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    emp.acceptData();
                    break;

                case 2:
                    emp.displayData();
                    break;

                case 3:
                    System.out.println("Program Exited...");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}