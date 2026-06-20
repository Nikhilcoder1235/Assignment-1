package com.app;

import java.util.*;

public class Main {

    static Set<Department> departments = new HashSet<>();
    static List<Student> students = new LinkedList<>();
    static Map<Integer, Student> studentMap = new HashMap<>();

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n----- MENU -----");
            System.out.println("1. Add Department");
            System.out.println("2. Display Departments");
            System.out.println("3. Add Student");
            System.out.println("4. Display Students");
            System.out.println("5. Search Student by Roll Number");
            System.out.println("6. Update Student Details");
            System.out.println("7. Delete Student by Roll Number");
            System.out.println("8. Display Students Department-wise");
            System.out.println("0. Exit");

            System.out.print("Enter choice : ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    addDepartment();
                    break;

                case 2:
                    displayDepartments();
                    break;

                case 3:
                    addStudent();
                    break;

                case 4:
                    displayStudents();
                    break;

                case 5:
                    searchStudent();
                    break;

                case 6:
                    updateStudent();
                    break;

                case 7:
                    deleteStudent();
                    break;

                case 8:
                    displayDepartmentWise();
                    break;

                case 0:
                    System.out.println("Thank You!");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 0);
    }

    // 1. Add Department
    static void addDepartment() {

        System.out.print("Enter Department Id : ");
        int id = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter Department Name : ");
        String name = sc.nextLine();

        Department dept = new Department(id, name);

        if (departments.add(dept))
            System.out.println("Department Added Successfully");
        else
            System.out.println("Department already exists");
    }

    // 2. Display Departments
    static void displayDepartments() {

        for (Department d : departments)
            System.out.println(d);
    }

    // 3. Add Student
    static void addStudent() {

        System.out.print("Enter Roll No : ");
        int roll = sc.nextInt();

        if (studentMap.containsKey(roll)) {
            System.out.println("Roll Number already exists");
            return;
        }

        sc.nextLine();

        System.out.print("Enter Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Marks : ");
        double marks = sc.nextDouble();

        System.out.print("Enter Department Id : ");
        int deptId = sc.nextInt();

        Department dept = null;

        for (Department d : departments) {
            if (d.getDeptId() == deptId) {
                dept = d;
                break;
            }
        }

        if (dept == null) {
            System.out.println("Department not found");
            return;
        }

        Student s = new Student(roll, name, marks, dept);

        students.add(s);
        studentMap.put(roll, s);

        System.out.println("Student Added Successfully");
    }

    // 4. Display Students
    static void displayStudents() {

        for (Student s : students)
            System.out.println(s);
    }

    // 5. Search Student
    static void searchStudent() {

        System.out.print("Enter Roll Number : ");
        int roll = sc.nextInt();

        Student s = studentMap.get(roll);

        if (s != null)
            System.out.println(s);
        else
            System.out.println("Student not found");
    }

    // 6. Update Student
    static void updateStudent() {

        System.out.print("Enter Roll Number : ");
        int roll = sc.nextInt();

        Student s = studentMap.get(roll);

        if (s == null) {
            System.out.println("Student not found");
            return;
        }

        sc.nextLine();

        System.out.print("Enter New Name : ");
        String name = sc.nextLine();

        System.out.print("Enter New Marks : ");
        double marks = sc.nextDouble();

        s.setName(name);
        s.setMarks(marks);

        System.out.println("Updated Successfully");
    }

    // 7. Delete Student
    static void deleteStudent() {

        System.out.print("Enter Roll Number : ");
        int roll = sc.nextInt();

        Student s = studentMap.remove(roll);

        if (s != null) {
            students.remove(s);
            System.out.println("Deleted Successfully");
        } else
            System.out.println("Student not found");
    }

    // 8. Department Wise Students
    static void displayDepartmentWise() {

        for (Department d : departments) {

            System.out.println("\nDepartment : " + d.getDeptName());

            for (Student s : students) {

                if (s.getDepartment().equals(d))
                    System.out.println(s);
            }
        }
    }
}