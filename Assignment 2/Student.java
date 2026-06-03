package Second;
import java.util.Scanner;
class Student1{
	int rollNo;
	String name;
	double marks;
	
   void acceptdata() {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Enter Student rollno:");
	   rollNo = sc.nextInt();
	   sc.nextLine();
	   
	   System.out.print("Enter Student name:");
	   name = sc.nextLine();
	   
	   System.out.print("Enter Student Marks:");
	   marks = sc.nextDouble();
	   
   }
   void displaydata() {
	   System.out.println("Roll no: "+ rollNo);
	   System.out.println("Name : "+ name);
	   System.out.print("Marks:"+ marks);
   }
   void calculategrade() {
	    if(marks > 75) {
	    	System.out.println("Grade A");
	    }
	    else if(marks >= 60 && marks <= 74) {
	    	System.out.println("Grade B");
	    }
	    else if(marks >= 50 && marks <= 59) {
	    	System.out.println("Grade C");
	    }
	    else {
	    	System.out.println("Fail");
	    }
   }
}
public class Student {

	public static void main(String[] args) {
		
   Scanner sc = new Scanner(System.in);
   Student1 ref = new Student1();
   int choice;
   do {
	   System.out.println("\n===== Student Menu =====");
       System.out.println("1. Accept Student Data");
       System.out.println("2. Display Student Data");
       System.out.println("3. Calculate Grade");
       System.out.print("Enter Choice: ");
       
       
       choice = sc.nextInt();
       
       switch(choice) {
       case 1:
       
    	   ref.acceptdata();
    	   break;
      
       case 2:
    	   ref.displaydata();
    	   break;
    	   
       case 3:
    	   ref.calculategrade();
    	   break;
    	   default:
    		   System.out.println("Invalid choice!");
       }
       
   }
   while(choice != 4);
	   sc.close();
	}

}
