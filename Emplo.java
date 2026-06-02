package First;
class Emp{
 String name = "Mayank vyas";
 
 void displayEmployee() {
	 System.out.println("NAME:"+ name);
 }
}
 class Manager extends Emp{
	 String department = "IT";
	public void displayManager() {
		 System.out.println("Department"+ department);
	 }
 }

public class Emplo {

	public static void main(String[] args) {
	Manager ref = new Manager();
	
     ref.displayManager();
     ref.displayEmployee();
	}

}
