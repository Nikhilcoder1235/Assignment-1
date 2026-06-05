package Third;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Division {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {


System.out.println("a:");
 int a = sc.nextInt();
 System.out.println("b:");
int b = sc.nextInt();

int result = a/b;  
System.out.println("result:"+result);
		}
catch(ArithmeticException e) {
	System.out.println("this is not allowed");
}
	catch(InputMismatchException e) {
		System.out.println("wrong input");
	}

System.out.println("program executed");

	}
	
	
	
	

}
