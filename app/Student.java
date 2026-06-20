package com.app;

public class Student {
    private int rollNo;
    private String name;
    private double marks;
    private Department department;

    public Student() {
    }

    public Student(int rollNo, String name, double marks, Department department) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.department = department;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo +
                ", name=" + name +
                ", marks=" + marks +
                ", department=" + department.getDeptName() + "]";
    }
}