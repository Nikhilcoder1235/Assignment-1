package First;


class Employee {
	String Empname ;
	int Empid;
	double Salary;
	
	Employee(String Empname, int Empid, double Salary){
		this.Empname = Empname;
		this.Empid = Empid;
		this.Salary = Salary;
	}
	
	void display() {
		System.out.println("EMPLOYEE NAME :"+ Empname);
		System.out.println("EMPLOYEE ID:"+ Empid);
		System.out.println("EMPLOYEE SALARY:"+ Salary);
	}
	
}

public class Nikhil {
	public static void main(String[] args) {
		Employee ref = new Employee("Mayank Vyas",01,60000);
		ref.display();
	}
}