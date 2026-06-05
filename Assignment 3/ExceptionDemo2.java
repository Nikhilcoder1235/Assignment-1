package Third;
import java.util.Scanner;

class InvalidAgeException extends Exception{
	InvalidAgeException(String message)
	{
		super(message);
	}
}
public class ExceptionDemo2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
		System.out.println("enter age:");
		int age = sc.nextInt();
		
		if(age<18) {
			throw new InvalidAgeException("YOU ARE NOT ELIGBLE!");
		}
		System.out.println("your age is"+age +"you are eligible");
		}
		catch(InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
  sc.close();
	}

}
